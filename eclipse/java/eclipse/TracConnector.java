package eclipse;

import java.sql.*;
import java.util.HashMap;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TracConnector {
	Connection dbConnection = null;

	public int trac_Connect(String tracProjectRoot) {
		try {
			Path tracRoot = Paths.get(tracProjectRoot).resolve("db").normalize();
			Class.forName("org.sqlite.JDBC");

			dbConnection = DriverManager.getConnection("jdbc:sqlite:" + tracRoot.toString());
			dbConnection.setAutoCommit(false);

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			return -1;
		}
		System.out.println("Trac Connection Successful");
		return 0;
	}

	public HashMap<Integer, Ticket> queryTickets(HashMap<Integer, Ticket> tickets, boolean updateValues) {
		Statement stmt = null;
		try {
			stmt = dbConnection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * from ticket inner join ticket_custom WHERE\r\n"
					+ "ticket.id = ticket_custom.ticket\r\n" + "order by ticket asc");

			while (rs.next()) {
				Ticket temp = new Ticket();
				int ticketIDInt = rs.getInt("id");

				if (tickets.containsKey(ticketIDInt) == false || (updateValues)) {
					temp.id = "IITS-" + rs.getInt("id");
					temp.description = rs.getString("description");
					temp.summary = rs.getString("summary");
					temp.timFeedback = rs.getString("value");
					temp.version = rs.getString("version");
					if (tickets.containsKey(ticketIDInt)) {
						if (updateValues)
							tickets.replace(ticketIDInt, temp);
					} else
						tickets.put(ticketIDInt, temp);
				}
			}
			rs.close();

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			return null;
		}
		return tickets;

	}
}
