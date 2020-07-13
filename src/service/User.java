package service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Base64;
import java.util.Scanner;

import com.itextpdf.text.DocumentException;

import utility.ConnectionManager;

public class User {
	
    boolean hasNum=false;
    boolean hasUpp=false;
    int n;
	
	public void checkUser(int userid,String username,String password,String phno) throws ClassNotFoundException, SQLException, IOException, DocumentException {
	            Scanner sc=new Scanner(System.in);
	            n=phno.length();
		        if (password.length() < 8) {
		        	System.out.println("Password must be at least 8 characters");
		        }
		        else if(password.length() > 20) {
			   	      System.out.println("Password should not exceed 20 characters"); 
			   	} 
		        else if(n!=10) {
		        	System.out.println("Enter a valid phone number");
		        }
		        else if(password.length()>=8 && password.length() <=20) {
		        for(int i=0;i<password.length();i++) {
		        	char c=password.charAt(i);
		        	if(Character.isDigit(c)) {
		        		hasNum=true;
		        	}
		        	else if(Character.isUpperCase(c)) {
		        		hasUpp=true;
		        	}
		        	
		        }
		       
		        if(hasNum  && hasUpp == true && n==10) {
		        	// String encryptedPassword=getEncrypted(password);
		         try {
		        	Connection con=ConnectionManager.getConnection();    		    	
     		    	String sql="INSERT INTO USERNAME(USERID,USERNAME,PASSWORD,PHNO)VALUES(?,?,?,?)";
     		    	PreparedStatement st=con.prepareStatement(sql);		    	
     		    	st.setInt(1,userid);
     		    	st.setString(2,username);
     		    	st.setString(3,password);
     		    	st.setString(4,phno);
     		    	st.executeUpdate();
     		    	con.close();
     		    	System.out.println("Successfully registered");
		         }
		         catch(Exception e) {
		        	 System.out.println("Registration failed !! UserID already exists");
		         }
		   		        			        		        		     
		        	}		        
		        else 
		            {
		        	System.out.println("Password did'nt meet the requirements");
		        	}		   
		        }	      
	}
	//private String getEncrypted(String password) {
	//	return Base64.getEncoder().encodeToString(password.getBytes());
	//}
}
