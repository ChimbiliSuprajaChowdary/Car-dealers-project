package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;
import java.util.Scanner;

import utility.ConnectionManager;

public class Userlogin {

	public void checkUser1(int userid,String username1,String password1) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		String sql="SELECT * FROM USERNAME";
		PreparedStatement ps=ConnectionManager.getConnection().prepareStatement(sql);
	    ResultSet rs=ps.executeQuery();
	    while(rs.next()) {
	    	String username=rs.getString("username");
	    	String password=rs.getString("password");   
	    
	    	if(username1.equals(username) && password1.equals(password)) {

	    		System.out.println("Successfully logged in, Hello "+username +"!!");
        		System.out.println("");
        		System.out.println("Enter 1 to check out what services we provide:");
        		int b=sc.nextInt();
        	
        		if(b==1) {
        			System.out.println("");
        			System.out.println("Select one of them:");
        			System.out.println("1.Buy a car");
        			System.out.println("2.Sell a car");
        			System.out.println("3.Servicing");
        			System.out.println("4.Modifications");
        			
        			int c=sc.nextInt();
        			if(c==1) {
        				BuyCar buycar=new BuyCar();
        				buycar.Buy(userid,username);
        				
        			}
        			else if(c==2) {
	        			SellCar sellcar=new SellCar();
	        			sellcar.Sell(userid,username);
	        		}
        			else if(c==3) {
        			Service serv=new Service();
        			serv.CarService(userid,username);
        			}
        			else if(c==4) {
        				Modify mod=new Modify();
        				mod.CarModify(userid,username);	
        			}
        			
        			
        			else if(c!= 1 || c!=2 ||c!=3 ||c!=4) {
        				System.out.println("You have to choose from above options");
        			}       		
        		}
	    	
	    	}
	    	
	    	else {
	    	   System.out.println("Your details have not matched");
	       }
	    
	    }
	    
	}
	//private String getDecrypted(String password) {
	//	return new String(Base64.getMimeDecoder().decode(password));
	//}
}
