package eclipse;

import org.eclipse.epsilon.common.util.FileUtil;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.EolModule;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class ITSCore {

	static void createNewLTMs(HashMap<Integer, Ticket> tickets) {
		// Model Mgmt operations;
		File ltmRoot = new File("LTM");
		File templateModel = new File("model\\template.tim");
		File templateGMF = new File("model\\template.tim_diagram");
		for (Ticket tracTicket : tickets.values()) {
			File[] ltms = ltmRoot.listFiles();
			boolean ltmFound = false;
			for (File ltm : ltms) {
				if (ltm.getName().equals(tracTicket.id)) {
					ltmFound = true;
					break;
				}
			}
			if (!ltmFound) {
				try {
					FileUtil.copy(templateGMF, new File(".\\LTM\\" + tracTicket.id + ".tim_diagram"));
					FileUtil.copy(templateModel, new File(".\\LTM\\" + tracTicket.id + ".tim"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		if (args[0].toString().equals("--mode")) {
			HashMap<Integer, Ticket> tickets = new HashMap<Integer, Ticket>();

			TracConnector tracConnector = new TracConnector();
			int status = tracConnector.trac_Connect(".\\..\\Trac");

			if (status == -1)
				throw new Exception("Unable to connect to the ITS repository!");

			if (args[1].equals("NEW-CR-GTM")) {
				EmfModel model = new EmfModel();
				model.setMetamodelFile(".\\model\\TIM.ecore");
				model.setModelFile(".\\GTM\\GTM.tim");
				model.setName("GTM");
				model.setReadOnLoad(true);
				model.setStoredOnDisposal(true);
				model.load();
				
				EolModule eol = new EolModule();
				eol.getContext().getModelRepository().addModel(model);
				eol.parse("var version = GTMController.all.first().ltmCR;");
				eol.execute();
				
				String version = eol.getContext().getFrameStack().get("version").getValue().toString();
				if (version != null) {
					Ticket ticket = tracConnector.CreateNewTicket(version);
					tickets.put(ticket.id, ticket);
					createNewLTMs(tickets);
				}
				
				System.out.println(version);
							

			} else if (args[1] == "SYNC-CR") {
				tickets = tracConnector.queryTickets(tickets, true);
				if (status != -1) {
					tickets = tracConnector.queryTickets(tickets, false);
					if (tickets == null) {
						System.out.println("Query failed");
					} else {
						createNewLTMs(tickets);
					}
				}
			}

		} else {
			System.out.println(args[0]);
			throw new IllegalArgumentException("Invalid Command\nProgram Usage: ITSCore.java --mode MODE");
		}
	}
}
