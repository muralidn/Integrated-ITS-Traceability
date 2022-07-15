package eclipse;

import org.eclipse.epsilon.common.util.FileUtil;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.evl.EvlModule;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

public class ITSCore {

	static int syncCR(String ltmFile, Ticket ticket) {

		EmfModel model = new EmfModel();
		model.setMetamodelFile(".\\model\\TIM.ecore");
		model.setModelFile(ltmFile);
		model.setName("LTM");
		model.setReadOnLoad(true);
		model.setStoredOnDisposal(true);
		try {
			model.load();
		} catch (EolModelLoadingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			model.close();
			return -1;
		}

		EolModule eol = new EolModule();
		eol.getContext().getModelRepository().addModel(model);
		try {

			StringBuilder str = new StringBuilder();

			str.append("var cr = new LTM!Change_Request_Ticket;\n");
			str.append("cr.crID = " + ticket.id + ";\n");
			str.append("cr.summary = \"" + ticket.summary + "\";\n");
			str.append("cr.description = \"" + ticket.description + "\";\n");
			str.append("cr.version = \"" + ticket.version + "\";\n");
			str.append("cr.chHelpful = \"" + ticket.timFeedback + "\";\n");
			str.append("cr.mergeRationale = \"" + ticket.mergeRationale + "\";\n");
			str.append("cr.plannedLOE = " + ticket.plannedLOEHrs + ";\n");
			str.append("cr.actualLOE = " + ticket.actualLOEHrs + ";\n");
			str.append("var ltmBoundary = LTM!GlobalTraceModel.all.first;\n");
			str.append("ltmBoundary.CR_Tickets.add(cr);\n");

			System.out.println(str.toString());
			eol.parse(str.toString());
			eol.execute();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			model.close();
			return -2;
		}

		model.close();
		return 0;
	}

	static void createNewLTMs(HashMap<Integer, Ticket> tickets) {
		// Model Mgmt operations;
		File ltmRoot = new File("LTM");
		File templateModel = new File("model\\template.tim");
		Path templateGMF = Paths.get("model\\template.tim_diagram");

		for (Ticket tracTicket : tickets.values()) {
			File[] ltms = ltmRoot.listFiles();
			boolean ltmFound = false;
			for (File ltm : ltms) {
				if (ltm.getName().equals(tracTicket.id + ".tim")) {
					ltmFound = true;
					break;
				}
			}
			if (!ltmFound) {
				try {

					FileUtil.copy(templateModel, new File(".\\LTM\\" + tracTicket.id + ".tim"));

					Charset charset = StandardCharsets.UTF_8;
					String content = new String(Files.readAllBytes(templateGMF), charset);
					content = content.replaceAll("FILE_NAME", tracTicket.id.toString());
					Path ltmGMF = Paths.get(".\\LTM\\" + tracTicket.id + ".tim_diagram");
					Files.write(ltmGMF, content.getBytes(charset));
					int status = syncCR(".\\LTM\\" + tracTicket.id + ".tim", tracTicket);
					if (status < 0) {
						System.out.println("Sync CR failed");
					}

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	static int copyGTM2LTM(String ltmFile, EmfModel GTM) {

		File[] ltms = new File("LTM").listFiles();
		boolean ltmFound = false;
		for (File ltm : ltms)
			if (ltm.getName().equals(ltmFile)) {
				ltmFound = true;
				break;
			}
		if (ltmFound) {
			EmfModel model = new EmfModel();
			model.setMetamodelFile(".\\model\\TIM.ecore");
			model.setModelFile(".\\LTM\\" + ltmFile);
			model.setName("LTM");
			model.setReadOnLoad(true);
			model.setStoredOnDisposal(true);
			try {
				model.load();
			} catch (EolModelLoadingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				model.close();
				return -2;
			}

			EolModule eol = new EolModule();
			eol.getContext().getModelRepository().addModel(GTM);
			eol.getContext().getModelRepository().addModel(model);
			try {
				eol.parse(new File(".\\eol\\GTM2LTM.eol"));
				eol.execute();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				model.close();
				return -3;
			}

			EvlModule evlModule = new EvlModule();
			evlModule.getContext().getModelRepository().addModel(model);

			try {
				evlModule.parse(new File("..\\eclipse.validation\\evl\\LTMTraceLinks.evl"));
				evlModule.execute();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			model.close();

			return 0;
		} else
			return -1;

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
				eol.parse("var createNewCR = GTMController.all.first().createNewCR;"
						+ "var ltmCR = GTMController.all.first().ltmCR;"
						+ "var buildVersion = GTMVersion.all.first().version;");

				eol.execute();

				Boolean boolNewCR = false;
				Object objNewCR = eol.getContext().getFrameStack().get("createNewCR").getValue();
				if (objNewCR != null) {
					boolNewCR = (Boolean) objNewCR;
				}

				String strLinkedLTM = "";
				Object objLinkedLTM = eol.getContext().getFrameStack().get("ltmCR").getValue();
				if (objLinkedLTM != null) {
					strLinkedLTM = objLinkedLTM.toString();
				}

				String strVersion = "";
				Object objVersion = eol.getContext().getFrameStack().get("buildVersion").getValue();
				if (objVersion != null) {
					strVersion = objVersion.toString();
				}

				if (boolNewCR) {
					if (strVersion != "") {
						Ticket ticket = tracConnector.CreateNewTicket(strVersion);
						tickets.put(ticket.id, ticket);
						createNewLTMs(tickets);
					}
				} else {
					strLinkedLTM += ".tim";
					int ltmStatus = copyGTM2LTM(strLinkedLTM, model);
					System.out.println(ltmStatus);
				}
				model.close();

			} else if (args[1].equals("SYNC-CR")) {
				if (status != -1) {
					tickets = tracConnector.queryTickets(tickets, false, true);
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
