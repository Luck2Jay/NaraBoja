package Naraboja;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Create_CSV {
			
	  private static final Connection con = DB_Connection.getConnection();

	  public static void createTable(){  
	      try{	         
	         PreparedStatement create = con.prepareStatement(
	               "CREATE TABLE USER_CHOICE( "
	               + "����1 text,"
	               + "������ text,"
	               + "�����α� int,"
	               + "���� int,"
	               + "��ġ text,"
	               + "���� text,"
	               + "�ֿ䵵�� text,"
	               + "���� text,"
	               + "��� text,"
	               + "�ֿ��� text)");
	         
	         PreparedStatement create1 = con.prepareStatement(
	                 "CREATE TABLE INFORMATION( "
	                 + "����1 text,"
	                 + "������ text,"
	                 + "�����α� int,"
	                 + "���� int,"
	                 + "��ġ text,"
	                 + "���� text,"
	                 + "�ֿ䵵�� text,"
	                 + "���� text,"
	                 + "��� text,"
	                 + "�ֿ��� text)");
	         
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