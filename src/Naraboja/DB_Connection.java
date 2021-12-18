package Naraboja;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB_Connection {
	 public static Connection getConnection(){ // connect DB
	      try {
	         String driver = "com.mysql.cj.jdbc.Driver";
	         String user = "root";
	         String password = "1111";
	         String url = "jdbc:mysql://localhost:3306/nara";
	         Class.forName(driver);

	         Connection con = DriverManager.getConnection(url, user, password);
	         System.out.println("The Connection Success");
	         return con;
	         }catch (Exception e) {
	         System.out.println(e.getMessage());
	         return null;
	         }
	   }
}