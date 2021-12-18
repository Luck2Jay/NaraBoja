package Naraboja;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;

public class CountryInfo {
	
	 private static final Connection con = DB_Connection.getConnection();

	
	 public static String[] getCountry(){ // only for comboBox Country list
	      try{

	    	 PreparedStatement statement = con.prepareStatement("select 국가1 FROM information");
	         ResultSet results = statement.executeQuery(); // excute query   
	         
	         String[] arr = new String[227];
	         
	         int i = 0;
	         while(results.next()){
	            arr[i] = results.getString("국가1");
	            i++;
	         }
	         
	         return arr;

	      }catch(Exception e){ // prevent execption
	         System.out.println(e.getMessage());
	         return null;
	      }
	   }
	  
	   public static String getCapital(String country){ // For only capital 
	      
	      String sql = "insert into user_choice(국가1, 수도명) values(?,?)";

	      try{
	         PreparedStatement statement = con.prepareStatement("Select 국가1, 수도명 FROM information");
	         ResultSet results = statement.executeQuery(); // excute query   
	         
	         String[] arr = new String[227];
	         String[] capital = new String[227];

	         int i = 0;
	         while(results.next()){
	            String cpname = results.getString("수도명");
	            if(cpname.equals("0")) capital[i] = "없음";
	            else capital[i] = results.getString("수도명");
	            arr[i] = results.getString("국가1");
	            i++;
	         }
	         
	         int index = Arrays.binarySearch(arr, country);
	         
	         PreparedStatement state = con.prepareStatement(sql);
	         state.setString(1,arr[index]);
	         state.setString(2,capital[index]);
	         state.executeUpdate(); // excute query   
	         
	         return capital[index]; 
	         
	      }catch(Exception e){ // prevent execption
	         System.out.println(e.getMessage());
	         return null;
	      }
	   }
	   
	   public static String getTextInfo(String country,String col){ // for text type data in CSV
	      
	      String sql = "insert into user_choice(국가1, "+col+" ) values(?,?)";
	      
	      try{
	         PreparedStatement statement = con.prepareStatement("select 국가1,"+col+" FROM information");
	         ResultSet results = statement.executeQuery(); // excute query   
	         
	         String[] arr = new String[227];
	         String[] info = new String[227];
	         
	         int i = 0;
	         while(results.next()){
	               arr[i] = results.getString("국가1");
	               info[i] = results.getString(col);
	            i++;
	         }
	         int index = Arrays.binarySearch(arr, country);

	         PreparedStatement state = con.prepareStatement(sql);
	         state.setString(1,country);
	         state.setString(2,info[index]);
	         state.executeUpdate(); // excute query   
	         
	         return info[index]; 
	         
	      }catch(Exception e){ // prevent execption
	         System.out.println(e.getMessage());
	         return null;
	      }
	   }
	   
	  public static int getNumInfo(String country,String col){ // For area & population int type data in CSV
	   
	      String sql = "insert into user_choice(국가1, "+col+" ) values(?,?)";
	     
	     try{
	         PreparedStatement statement = con.prepareStatement("Select 국가1, "+col+" FROM information");
	         ResultSet results = statement.executeQuery(); // excute query   
	         
	         String[] arr = new String[227];
	         int[] area = new int[227];
	         
	         int i = 0;
	         
	         while(results.next()){
	            arr[i] = results.getString("국가1");
	            area[i] = results.getInt(col);
	            i++;
	         }

	         int index = Arrays.binarySearch(arr, country);
	      
	         PreparedStatement state = con.prepareStatement(sql);
	         
	         state.setString(1,country);
	         state.setInt(2,area[index]);
	         state.executeUpdate(); // excute query   
	         
	         return area[index];  
	         
	      }catch(Exception e){ // prevent execption
	         System.out.println(e.getMessage());
	         return 0;
	      }
	   }
}