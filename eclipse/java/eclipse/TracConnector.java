package eclipse;

import java.sql.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TracConnector {
	Connection dbConnection = null;
	
	public int trac_Connect(String tracProjectRoot) {   
//	   Statement stmt = null;
		try {
			Path tracRoot = Paths.get(tracProjectRoot).resolve("db").normalize();
			Class.forName("org.sqlite.JDBC");
			
			dbConnection = DriverManager.getConnection("jdbc:sqlite:" + tracRoot.toString());
			dbConnection.setAutoCommit(false);
			
//			stmt = c.createStatement();
//		    ResultSet rs = stmt.executeQuery( "SELECT * FROM ticket;" );			
//	      while ( rs.next() ) {
//
//	          int id = rs.getInt("id");
//	          String type = rs.getString("type");
//	          long time = rs.getLong("time");
//	          long changetime = rs.getLong("changetime");
//	          String component = rs.getString("component");
//	          float version = rs.getFloat("version");
//	          String status = rs.getString("status");
//	          String summary = rs.getString("summary");
//	          String description = rs.getString("description");
//	          
//         
//	          System.out.println( "ID = " + id );
//	          System.out.println( "TYPE = " + type );
//	          System.out.println( "TIME = " + time );
//	          System.out.println( "CHANGETIME = " + changetime );
//	          System.out.println( "COMPONENT = " + component );
//	          System.out.println( "version = " + version );
//	          System.out.println( "status = " + status );
//	          System.out.println( "summary = " + summary );
//	          System.out.println( "description = " + description );
//	          
//	          
//	          System.out.println();
//	       }
//			rs.close();
			
		} catch (Exception e) {
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	         return -1;
	      }
	      System.out.println("Trac Connection Successfull");
	      return 0;
	   }
	

}
