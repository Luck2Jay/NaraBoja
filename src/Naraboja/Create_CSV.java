package Naraboja;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Create_CSV {
			
	  private static final Connection con = DB_Connection.getConnection();

	  public static void createTable(){  
	      try{	         
	         PreparedStatement create = con.prepareStatement(
	               "CREATE TABLE USER_CHOICE( "
	               + "국가1 text,"
	               + "수도명 text,"
	               + "수도인구 int,"
	               + "면적 int,"
	               + "위치 text,"
	               + "기후 text,"
	               + "주요도시 text,"
	               + "종교 text,"
	               + "언론 text,"
	               + "주요언어 text)");
	         
	         PreparedStatement create1 = con.prepareStatement(
	                 "CREATE TABLE INFORMATION( "
	                 + "국가1 text,"
	                 + "수도명 text,"
	                 + "수도인구 int,"
	                 + "면적 int,"
	                 + "위치 text,"
	                 + "기후 text,"
	                 + "주요도시 text,"
	                 + "종교 text,"
	                 + "언론 text,"
	                 + "주요언어 text)");
	         
	         create.execute();
	         create1.execute();
	         
	         System.out.println("Table successfully created");
	      }catch(Exception e){
	         System.out.println(e.getMessage());
	      }
	   }

	  public static void dropTable(){ 
	     
	      String sql = "drop table user_choice";

	      try{
	         PreparedStatement delete = con.prepareStatement(sql);
	         delete.execute();
	         System.out.println("Table successfully droped");
	      }catch(Exception e){
	         System.out.println(e.getMessage());
	      }
	   }
	  
	  public static void csvOut(){
	     
	      String sql = "SELECT * \n"
	            + "\n"
	            + "INTO OUTFILE 'C:/Users/new/Desktop/userdata.csv' \n"
	            + "\n"
	            + " CHARACTER SET euckr\n"
	            + "\n"
	            + " FIELDS TERMINATED BY ';' \n"
	            + "\n"
	            + " LINES TERMINATED BY '\\n'\n"
	            + " \n"
	            + " FROM nara.user_choice";
	      try{
	         PreparedStatement csvout = con.prepareStatement(sql);
	         csvout.execute();
	      }catch(Exception e){
	         System.out.println(e.getMessage());
	      }
	   }
	  
}