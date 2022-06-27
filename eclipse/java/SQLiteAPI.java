import java.sql.*;

public class SQLiteAPI {
	public static void main(String args[]) {
	   Connection c = null;
	   Statement stmt = null;
		try {
			
	        long ms = System.currentTimeMillis();
	        System.out.println(ms);
	          
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:.\\..\\Trac\\db");
			c.setAutoCommit(false);
			
			stmt = c.createStatement();
		    ResultSet rs = stmt.executeQuery( "SELECT * FROM ticket;" );			
	      while ( rs.next() ) {

	          int id = rs.getInt("id");
	          String type = rs.getString("type");
	          long time = rs.getLong("time");
	          long changetime = rs.getLong("changetime");
	          String component = rs.getString("component");
	          float version = rs.getFloat("version");
	          String status = rs.getString("status");
	          String summary = rs.getString("summary");
	          String description = rs.getString("description");
	          
         
	          System.out.println( "ID = " + id );
	          System.out.println( "TYPE = " + type );
	          System.out.println( "TIME = " + time );
	          System.out.println( "CHANGETIME = " + changetime );
	          System.out.println( "COMPONENT = " + component );
	          System.out.println( "version = " + version );
	          System.out.println( "status = " + status );
	          System.out.println( "summary = " + summary );
	          System.out.println( "description = " + description );
	          
	          
	          System.out.println();
	       }
	       rs.close();
			
		} catch (Exception e) {
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Opened database successfully");
	   }
	}