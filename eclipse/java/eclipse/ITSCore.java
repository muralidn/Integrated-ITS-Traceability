package eclipse;

import java.util.concurrent.TimeUnit;

import org.eclipse.epsilon.common.util.FileUtil;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class ITSCore {

	static void createNewLTMs(HashMap<Integer, Ticket> tickets) {
		// Model Mgmt operations;
		File ltmRoot = new File("LTM");
		File template = new File("model\\template.tim_diagram");
		for (Ticket tracTicket : tickets.values()) {
			File[] ltms = ltmRoot.listFiles();
			boolean ltmFound = false;
			for (File ltm : ltms) {
				if (tracTicket.id.equals(ltm.getName())) {
					ltmFound = true;
					break;
				}
			}
			if (!ltmFound) {
				try {
					FileUtil.copy(template, new File(".\\LTM\\" + tracTicket.id+".tim_diagram"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Ticket> tickets = new HashMap<Integer, Ticket>();

		TracConnector tracConnector = new TracConnector();
		int status = tracConnector.trac_Connect(".\\..\\Trac");
		tickets = tracConnector.queryTickets(tickets, true);
		if (status != -1) {
			// while (true) {
			tickets = tracConnector.queryTickets(tickets, false);
			if (tickets == null) {
				System.out.println("Query failed");
				// break;
			} else {
				createNewLTMs(tickets);

			}
		}
		// }
	}

}
