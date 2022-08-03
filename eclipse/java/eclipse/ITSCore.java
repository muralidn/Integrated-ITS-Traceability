package eclipse;

import org.eclipse.epsilon.common.util.FileUtil;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.evl.EvlModule;

import java.io.File;
import java.io.IOException;
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

			eol.parse("var cr = Change_Request_Ticket.all.first();");
			eol.execute();

			Object cr = eol.getContext().getFrameStack().get("cr").getValue();

			StringBuilder str = new StringBuilder();
			if (cr == null)
				str.append("var cr = new LTM!Change_Request_Ticket;\n");
			else
				str.append("var cr = Change_Request_Ticket.all.first();\n");

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

			// System.out.println(str.toString());
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

	static HashMap<Integer, String> createNewLTMs(HashMap<Integer, Ticket> tickets) {
		// Model Mgmt operations;
		File ltmRoot = new File("LTM");
		File templateModel = new File("model\\template.tim");
		Path templateGMF = Paths.get("model\\template.tim_diagram");

		HashMap<Integer, String> filepathMap = new HashMap<Integer, String>();

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
					String ltmFileName = tracTicket.id + ".tim";
					FileUtil.copy(templateModel, new File(".\\LTM\\" + ltmFileName));

					Charset charset = StandardCharsets.UTF_8;
					String content = new String(Files.readAllBytes(templateGMF), charset);
					content = content.replaceAll("FILE_NAME", tracTicket.id.toString());
					Path ltmGMF = Paths.get(".\\LTM\\" + tracTicket.id + ".tim_diagram");
					Files.write(ltmGMF, content.getBytes(charset));

					filepathMap.put(tracTicket.id, ltmFileName);

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			int status = syncCR(".\\LTM\\" + tracTicket.id + ".tim", tracTicket);
			if (status < 0) {
				System.out.println("Sync CR failed");
			}
		}

		return filepathMap;
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

			if (args[1].equals("STRATEGY")) {
				if (status != -1) {
					tickets = tracConnector.queryTickets(TICKET_FILTER.CLOSED_ONLY);
					if (tickets == null) {
						System.out.println("No closed tickets");
					} else {
						int timUseful = 0;
						int timNotUseful = 0;

						for (Ticket ticket : tickets.values()) {
							int out = syncCR(".\\LTM\\" + ticket.id + ".tim", ticket);
							if (out < 0) {
								System.out.println("Sync CR failed");
							}

							if (ticket.timFeedback.equals("YES"))
								timUseful++;
							else
								timNotUseful++;

						}

						String msg = "Based on the feedback from the previous sprint, %s %.2f%% of the developers indicated that traceability was helpful in making the changes";
						msg += "\nTIM & CR review %s NECESSARY";
						double usefulPercent = (timUseful * 100f) / (timUseful + timNotUseful);
						if (timUseful > timNotUseful) {
							msg = String.format(msg, "", usefulPercent, "IS NOT");
						} else {
							msg = String.format(msg, "ONLY", usefulPercent, "IS");
						}
						System.out.println(msg);
					}
				}
			}

			else if (args[1].equals("NEW-CR-GTM")) {
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
						HashMap<Integer, String> fileMap = createNewLTMs(tickets);
						int ltmStatus = copyGTM2LTM(fileMap.get(ticket.id), model);
						System.out.println(ltmStatus);
					}
				} else {
					strLinkedLTM += ".tim";
					int ltmStatus = copyGTM2LTM(strLinkedLTM, model);
					System.out.println(ltmStatus);
				}
				model.close();

			} else if (args[1].equals("SYNC-CR")) {
				if (status != -1) {
					tickets = tracConnector.queryTickets(TICKET_FILTER.NO_CLOSED);
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
