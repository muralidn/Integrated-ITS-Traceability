package eclipse;

import org.eclipse.epsilon.common.util.FileUtil;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ITSCore {
	
	class Constants {
		public static final String METAMODEL = ".\\model\\TIM.ecore";
		public static final String LTM_STR = "LTM";
		public static final String GTM_STR = "GTM";
		public static final String TEMPLATE_TIM_FILE = "model\\template.tim";
		public static final String TEMPLATE_TIM_DIAG_FILE = "model\\template.tim_diagram";
		public static final String TEMPLATE_FILE_EXT = ".tim";
		public static final String TEMPLATE_TIM_DIAG_FILE_EXT =".tim_diagram";		
		public static final String TEMPLATE_FILE_NAME_PLACEHOLDER = "FILE_NAME";
		public static final String LTM_ROOT = ".\\LTM\\";
		public static final String LTM_GENERIC_NAME = "MODEL";
		public static final String EVL_VALIDATE_TL = "..\\eclipse.validation\\evl\\LTMTraceLinks.evl";	
		public static final String TRAC_ROOT = ".\\..\\Trac";
		public static final String GTM_FILE_PATH = ".\\GTM\\GTM.tim";
		public static final String EOL_GTM2LTM = ".\\eol\\GTM2LTM.eol";	
		public static final String EOL_MINE_SIMULINK = ".\\eol\\MineSimulink.eol";	
		
	}

	static int syncCR(String ltmFile, Ticket ticket) {

		EMFModelWrapper model = new EMFModelWrapper(ltmFile, Constants.METAMODEL, Constants.LTM_STR);
		int epStatus = model.loadModel();
		if (epStatus != 0) {
			System.out.println("Failed to load: " + ltmFile);
			return epStatus;
		}

		EOLModuleWrapper eolModule = new EOLModuleWrapper();
		eolModule.addModel(model);

		String eolCommand = "var cr = Change_Request_Ticket.all.first();";
		epStatus = eolModule.parseEOL(eolCommand);
		if (epStatus != 0) {
			System.out.println("Failed to parse eol command: " + eolCommand);
			return epStatus;
		}

		epStatus = eolModule.executeEOL();
		if (epStatus != 0) {
			System.out.println("Failed to execute eol command: " + eolCommand);
			return epStatus;
		}

		Object cr = eolModule.getEOLVariable("cr");

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
		str.append("cr.status = \"" + ticket.status + "\";\n");
		str.append("var ltmBoundary = LTM!GlobalTraceModel.all.first;\n");
		str.append("ltmBoundary.CR_Tickets.add(cr);\n");

		// System.out.println(str.toString());
		epStatus = eolModule.parseEOL(str.toString());
		if (epStatus != 0) {
			System.out.println("Failed to parse eol command: " + str.toString());
			return epStatus;
		}

		epStatus = eolModule.executeEOL();
		if (epStatus != 0) {
			System.out.println("Failed to execute eol command: " + str.toString());
			return epStatus;
		}

		model.closeModel();

		return 0;
	}

	static HashMap<Integer, String> createNewLTMs(HashMap<Integer, Ticket> tickets) {
		// Model Mgmt operations;
		File ltmRoot = new File(Constants.LTM_STR);
		File templateModel = new File(Constants.TEMPLATE_TIM_FILE);
		Path templateGMF = Paths.get(Constants.TEMPLATE_TIM_DIAG_FILE);

		HashMap<Integer, String> filepathMap = new HashMap<Integer, String>();

		for (Ticket tracTicket : tickets.values()) {
			File[] ltms = ltmRoot.listFiles();
			boolean ltmFound = false;
			for (File ltm : ltms) {
				if (ltm.getName().equals(tracTicket.id + Constants.TEMPLATE_FILE_EXT)) {
					ltmFound = true;
					break;
				}
			}
			if (!ltmFound) {
				try {
					String ltmFileName = tracTicket.id + ".tim";
					FileUtil.copy(templateModel, new File(Constants.LTM_ROOT + ltmFileName));

					Charset charset = StandardCharsets.UTF_8;
					String content = new String(Files.readAllBytes(templateGMF), charset);
					content = content.replaceAll(Constants.TEMPLATE_FILE_NAME_PLACEHOLDER, tracTicket.id.toString());
					Path ltmGMF = Paths.get(Constants.LTM_ROOT + tracTicket.id + Constants.TEMPLATE_TIM_DIAG_FILE_EXT);
					Files.write(ltmGMF, content.getBytes(charset));

					filepathMap.put(tracTicket.id, ltmFileName);

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			int status = syncCR(Constants.LTM_ROOT + tracTicket.id + Constants.TEMPLATE_FILE_EXT, tracTicket);
			if (status < 0) {
				System.out.println("Sync CR failed");
			}
		}

		return filepathMap;
	}

	static int copyGTM2LTM(String ltmFile, EMFModelWrapper GTM) {

		File[] ltms = new File(Constants.LTM_STR).listFiles();
		boolean ltmFound = false;
		for (File ltm : ltms)
			if (ltm.getName().equals(ltmFile)) {
				ltmFound = true;
				break;
			}
		if (ltmFound) {
			
			EMFModelWrapper model = new EMFModelWrapper(ltmFile, Constants.METAMODEL, Constants.LTM_GENERIC_NAME);
			int epStatus = model.loadModel();
			if (epStatus != 0) {
				System.out.println("Failed to load: " + ltmFile);
				return epStatus;
			}
			
			EOLModuleWrapper eolModule = new EOLModuleWrapper();
			eolModule.addModel(GTM);
			eolModule.addModel(model);

			epStatus = eolModule.parseEOL(new File(Constants.EOL_GTM2LTM));
			if (epStatus != 0) {
				System.out.println("Failed to parse eol file: " + Constants.EOL_GTM2LTM);
				return epStatus;
			}

			epStatus = eolModule.executeEOL();
			if (epStatus != 0) {
				System.out.println("Failed to execute eol file: " + Constants.EOL_GTM2LTM);
				return epStatus;
			}
			
			validateLTM(model);

			model.closeModel();
			
			return 0;
		} else
			return -1;

	}
	
	static int validateLTM(EMFModelWrapper model) {
		
		EVLModuleWrapper evlModule = new EVLModuleWrapper();
		evlModule.addEMFModel(model);
			
		int epStatus = evlModule.parseEVL(new File(Constants.EVL_VALIDATE_TL));
		if (epStatus != 0) {
			System.out.println("Failed to parse evl file: " + Constants.EVL_VALIDATE_TL);
			return epStatus;
		}

		epStatus = evlModule.executeEVL();
		if (epStatus != 0) {
			System.out.println("Failed to execute evl file: " + Constants.EVL_VALIDATE_TL);
			return epStatus;
		}
			
		return 0;
	}
	
	static int mineLTM(String ltmFile) {
		
		EMFModelWrapper model = new EMFModelWrapper(ltmFile, Constants.METAMODEL, Constants.LTM_GENERIC_NAME);
		int epStatus = model.loadModel();
		if (epStatus != 0) {
			System.out.println("Failed to load: " + ltmFile);
			return epStatus;
		}
		
		SLREQWrapper simulinkReqModel = new SLREQWrapper();
		epStatus = simulinkReqModel.loadModel();
		if (epStatus != 0) {
			System.out.println("Failed to load Simulink Requirement");
			return epStatus;
		}
		
		EOLModuleWrapper eolModule = new EOLModuleWrapper();
		eolModule.addModel(model);
		eolModule.addModel(simulinkReqModel);

		epStatus = eolModule.parseEOL(new File(Constants.EOL_MINE_SIMULINK));
		if (epStatus != 0) {
			System.out.println("Failed to parse eol file: " + Constants.EOL_MINE_SIMULINK);
			return epStatus;
		}

		epStatus = eolModule.executeEOL();
		if (epStatus != 0) {
			System.out.println("Failed to execute eol file: " + Constants.EOL_MINE_SIMULINK);
			return epStatus;
		}
		
		validateLTM(model);
		model.closeModel();
		simulinkReqModel.closeModel();
		
		return 0;
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		if (args[0].toString().equals("--mode")) {
			
			System.out.println(args[1]);
			HashMap<Integer, Ticket> tickets = new HashMap<Integer, Ticket>();

			TracConnector tracConnector = new TracConnector();
			int status = tracConnector.trac_Connect(Constants.TRAC_ROOT);

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
							int out = syncCR(Constants.LTM_ROOT + ticket.id + Constants.TEMPLATE_FILE_EXT, ticket);
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
				
				EMFModelWrapper model = new EMFModelWrapper(Constants.GTM_FILE_PATH, Constants.METAMODEL, Constants.GTM_STR);
				int epStatus = model.loadModel();
				if (epStatus != 0) {
					System.out.println("Failed to load: " + Constants.GTM_FILE_PATH);
				}

				EOLModuleWrapper eolModule = new EOLModuleWrapper();
				eolModule.addModel(model);

				StringBuilder eolCommand = new StringBuilder();
				eolCommand.append("var createNewCR = GTMController.all.first().createNewCR;\n");
				eolCommand.append("var ltmCR = GTMController.all.first().ltmCR;\n");
				eolCommand.append("var buildVersion = GTMVersion.all.first().version;");
				
				epStatus = eolModule.parseEOL(eolCommand.toString());
				if (epStatus != 0) {
					System.out.println("Failed to parse eol command: " + eolCommand.toString());
				}

				epStatus = eolModule.executeEOL();
				if (epStatus != 0) {
					System.out.println("Failed to execute eol command: " + eolCommand.toString());
				}
				
				Boolean boolNewCR = false;
				Object objNewCR = eolModule.getEOLVariable("createNewCR");
				if (objNewCR != null) {
					boolNewCR = (Boolean) objNewCR;
				}

				String strLinkedLTM = "";
				Object objLinkedLTM = eolModule.getEOLVariable("ltmCR");
				if (objLinkedLTM != null) {
					strLinkedLTM = objLinkedLTM.toString();
				}

				String strVersion = "";
				Object objVersion = eolModule.getEOLVariable("buildVersion");
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
					strLinkedLTM += Constants.TEMPLATE_FILE_EXT;
					int ltmStatus = copyGTM2LTM(strLinkedLTM, model);
					System.out.println(ltmStatus);
				}
				
				model.closeModel();

			} else if (args[1].equals("SYNC-CR")) {
				if (status != -1) {
					tickets = tracConnector.queryTickets(TICKET_FILTER.ALL);
					if (tickets == null) {
						System.out.println("Query failed");
					} else {
						createNewLTMs(tickets);
					}
				}
			} else if ( (args[1].equals("MINE-LTM")) || (args[1].equals("MERGE-LTM"))) {
			    JFileChooser fileChooser = new JFileChooser(Constants.LTM_ROOT);
			    FileNameExtensionFilter ltmFilter = new FileNameExtensionFilter(
			        "TIM Model", "tim");
			    fileChooser.setFileFilter(ltmFilter);
			    int fileStatus = fileChooser.showOpenDialog(null);
			    if(fileStatus == JFileChooser.APPROVE_OPTION) {
			    	mineLTM(fileChooser.getSelectedFile().getAbsolutePath());
			    }
				
			} else if (args[1].equals("IMPACT-ANALYSIS")) {
				
			}
			

		} else {
			System.out.println(args[0]);
			throw new IllegalArgumentException("Invalid Command\nProgram Usage: ITSCore.java --mode MODE");
		}
		
		System.out.println("Complete!");
	}
}
