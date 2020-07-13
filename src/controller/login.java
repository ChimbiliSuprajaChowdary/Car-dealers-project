package controller;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.itextpdf.text.DocumentException;

import service.Admin;
import service.User;
import service.Userlogin;
import model.UserDetails;
import utility.ConnectionManager;


public class login {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException, DocumentException {
		ConnectionManager c=new ConnectionManager();
		 Connection a=c.getConnection();
		 if(a==null) {
			 System.out.println("Check your connection");			
		 }
		 else {
			 System.out.println("Connection established");
		 }
	    
		System.out.println("");
		System.out.println("**********--------------------CAR DEALERS & SERVICES--------------------**********");
		System.out.println("");
		System.out.println("1. Admin-Login");
		System.out.println("2. User-Register");
		System.out.println("3. User-Login");

		Scanner sc= new Scanner(System.in);
		int b=sc.nextInt();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    if(b==1) {
	       Admin admin=new Admin();
	       admin.AdminLogin1();
	       int n=sc.nextInt();
	       if(n==1) {	    	   
	    		   Admin admin1=new Admin();
	    		   System.out.println("Enter which user you want to delete!");
	    		   int userid=sc.nextInt();
	    		   admin1.deleteBuyCar(userid);
	    	   }
	       else if(n==2) {
	    	   Admin admin1=new Admin();
    		   System.out.println("Enter which user you want to delete!");
    		   int userid=sc.nextInt();
    		   admin1.deleteSellCar(userid);
	       }
	       else if(n==3) {
	    	   Admin admin1=new Admin();
    		   System.out.println("Enter which user you want to delete!");
    		   int userid=sc.nextInt();
    		   admin1.deleteServices(userid);
	       }
	       else if(n==4) {
	    	   Admin admin1=new Admin();
    		   System.out.println("Enter which user you want to delete!");
    		   int userid=sc.nextInt();
    		   admin1.deleteModify(userid);
	       }
		}
	    
		else if(b==2) {
		
		    UserDetails user1=new UserDetails();
		    User user=new User();
		    System.out.println("Enter ID: ");
			int userid = Integer.parseInt(br.readLine());
	        System.out.println("Enter username: ");	        
			String username = br.readLine();		
	        System.out.println("Enter password: ");
	        System.out.println("(*Make sure your password contains atleast 1 number and 1 uppercase letter*)");
	        String password = br.readLine();
	        System.out.println("Enter phone number: ");
	        String phno = br.readLine();
	        user1.setUsername(username);
	        user1.setPassword(password);
	        user1.setPhno(phno);
		    user.checkUser(userid,username,password,phno);
		}
		else if(b==3) {
			Userlogin userlogin=new Userlogin();
		    System.out.println("Enter ID: ");
			int userid = Integer.parseInt(br.readLine());
			System.out.println("Enter username");
			String username1=br.readLine();
			System.out.println("Enter password");
			String password1=br.readLine();			
			userlogin.checkUser1(userid,username1,password1);
		}
		else if(b!= 1 || b!=2 || b!=3) {
			System.out.println("You have to choose from the above given options");
		}
	    
	
	}
}
