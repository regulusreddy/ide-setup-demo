import java.sql.*;
import java.util.ArrayList;


public class patient_info_Demo {

	
	   // JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/hospital";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "root";
	   static ArrayList<String> a;
	   
	   public static ArrayList<String> main() {
	   Connection conn = null;
	   Statement stmt = null;
	   try{
		   a = new ArrayList<String>();
	      //STEP 2: Register JDBC driver
	      Class.forName("com.mysql.jdbc.Driver");

	      //STEP 3: Open a connection
	      System.out.println("Connecting to database...");
	      conn = DriverManager.getConnection(DB_URL,USER,PASS);

	      //STEP 4: Execute a query
	      System.out.println("Creating statement...");
	      stmt = conn.createStatement();
	      String sql;
	      sql = "SELECT * from patient_info";
	      ResultSet rs = stmt.executeQuery(sql);
	      while (rs.next()){
	    	  a.add(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	    	  //System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	      }
	      System.out.println("done");
	   }catch(Exception e){
		   e.printStackTrace();
	   }

	   return a;
	   }
}