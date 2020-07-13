package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import utility.ConnectionManager;

public class Admin {
	public void AdminLogin1() throws ClassNotFoundException, SQLException  {

		String Username1 = "itsnandan";
		String Password1 = "12345";

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username : ");
		String username1 = sc.next();
	    
		System.out.println("Enter Password : ");
		String password1 = sc.next();

		if (username1.equals(Username1) && password1.equals(Password1)) {
			System.out.println("Access Granted! Welcome Nandan!!");
			System.out.println(" ");
			System.out.println("1.Display USER details");
			System.out.println("2.Display BUYCAR details");
			System.out.println("3.Display SELLCAR details");
			System.out.println("4.Display SERVICES details");
			System.out.println("5.Display MODIFICATIONS details");
			int a=sc.nextInt();
			if(a==1) {
				  String sql="SELECT * FROM USERNAME ORDER BY USERID ASC";
				  PreparedStatement ps=ConnectionManager.getConnection().prepareStatement(sql);
				  ResultSet rs=ps.executeQuery();
				  System.out.println("UserId" + " " + " " +"Username" + " " + " " + " " + " " + " " + "Password"  + " " + " " + " "+ " " + " " + " "+ "PhNo");
				  System.out.println(" ");
				  while(rs.next()) {
					  int userid=rs.getInt(1);
					  String username=rs.getString(2);
					  String password=rs.getString(3);
					  String phno=rs.getString(4);	
					  System.out.println(userid + "\t" + username + "\t" + " "  + " " + " " + " " +password  + "\t" + phno);
				  }			   
			}
			else if(a==2) {
				  String sql="SELECT username.username,username.userid,buycar.id,buycar.company,buycar.model,buycar.price FROM username INNER JOIN buycar ON username.userid = buycar.userid";
				  PreparedStatement ps=ConnectionManager.getConnection().prepareStatement(sql);
				  ResultSet rs=ps.executeQuery();
				  System.out.println("Username" + " " + " " + " " + " " + " "+ " "+ " "+"Id" + " " + " " + " "+ " "+"UserId" + " " + " " +"Company" + " " + " " + " " + " " + " " + "Model"  + " " + " " + " "+ " "+ " " + " " + " "+ " "+ " "+ " "+ "Price");
				  System.out.println(" ");
				  while(rs.next()) {
					  String username=rs.getString(1);
					  int id=rs.getInt(2); 
					  int userid=rs.getInt(3);
					  String company=rs.getString(4);
					  String model=rs.getString(5);
					  String price=rs.getString(6);	
					  System.out.println(username + " "+" "+"\t" + id + "\t" + userid + "\t" + company + "\t" + model  + "\t" + price);					  
				  }
				  System.out.println(" ");
				  System.out.println("Enter 1 to delete any row from BuyCar");
			}
			else if(a==3) {
				  String sql="SELECT username.username,username.userid,sellcar.id,sellcar.company,sellcar.model,sellcar.askingprice,sellcar.sellerprice FROM username INNER JOIN sellcar ON username.userid = sellcar.userid";
				  PreparedStatement ps=ConnectionManager.getConnection().prepareStatement(sql);
				  ResultSet rs=ps.executeQuery();
				  System.out.println("Username" + " " + " " + " " + " " + " "+ " "+ " "+"Id" + " " + " " + " "+ " "+"UserId" + " " + " " +"Company" + " " + " " + " " + " " + " " + "Model"  + " " + " " + " "+ " "+ " " + " " + " "+ " "+ " "+ " "+ "AskingPrice"+" " + " " + " "+ " "+ " " + " " + " "+ " "+ " "+ " "+ " "+ " "+ " "+ " "+ " "+ " "+ " "+ " "+ " "+ " "+ " "+ "SellerPrice");
				  System.out.println(" ");
				  while(rs.next()) {
					  String username=rs.getString(1);
					  int id=rs.getInt(2); 
					  int userid=rs.getInt(3);
					  String company=rs.getString(4);
					  String model=rs.getString(5);
					  String Aprice=rs.getString(6);	
					  String Sprice=rs.getString(7);	
					  System.out.println(username + " "+" "+"\t" + id + "\t" + userid + "\t" + company + "\t" + model  + "\t" + Aprice + "\t" + Sprice);
					 
				  }
				  System.out.println(" ");
				  System.out.println("Enter 2 to delete any row from SellCar");
			}
			else if(a==4) {
				  String sql="SELECT username.username,username.userid,services.id,services.servicename FROM username INNER JOIN services ON username.userid = services.userid";
				  PreparedStatement ps=ConnectionManager.getConnection().prepareStatement(sql);
				  ResultSet rs=ps.executeQuery();
				  System.out.println("Username" + " " + " " + " " + " " + " "+ " "+ " "+"Id" + " " + " " + " " + " " +"UserId" + " "+ " " + " " + " " + " "  + " " +"Service");
				  System.out.println(" ");
				  while(rs.next()) {
					  String username=rs.getString(1);
					  int id=rs.getInt(2); 
					  int userid=rs.getInt(3);
					  String service=rs.getString(4);	
					  System.out.println(username + " "+" "+"\t" + id + "\t" + userid + "\t" + service);
					 
				  }
				  System.out.println(" ");
				  System.out.println("Enter 3 to delete any row from Services");
			}
			else if(a==5) {
				  String sql="SELECT username.username,username.userid,modifications.id,modifications.modifyname FROM username INNER JOIN modifications ON username.userid = modifications.userid";
				  PreparedStatement ps=ConnectionManager.getConnection().prepareStatement(sql);
				  ResultSet rs=ps.executeQuery();
				  System.out.println("Username" + " " + " " + " " + " " + " "+ " "+ " "+"Id" + " " + " " + " " + " " +"UserId" + " " + " "+ " " + " " + " " + " " + " " + " "  +"Modify");
				  System.out.println(" ");
				  while(rs.next()) {
					  String username=rs.getString(1);
					  int id=rs.getInt(2); 
					  int userid=rs.getInt(3);
					  String modify=rs.getString(4);	
					  System.out.println(username + " "+" "+"\t" +id + "\t" + userid + "\t" + modify);
				
				  }
				  System.out.println(" ");
				  System.out.println("Enter 4 to delete any row from Modifications");
			}
		}
		else if (username1.equals(Username1)) {
			System.out.println("Invalid Password!");
		} 
		else if (password1.equals(Password1)) {
			System.out.println("Invalid Username!");
		}
		else {
			System.out.println("Invalid Username & Password!");
		}
	}
			public void deleteBuyCar(int userid) throws ClassNotFoundException, SQLException {
				int temp=userid;
				String sql="DELETE FROM BUYCAR WHERE USERID=?";
				PreparedStatement ps=ConnectionManager.getConnection().prepareStatement(sql);
                ps.setInt(2, temp);
                ps.executeUpdate();
                System.out.println("Successfully deleted");
			}
			public void deleteSellCar(int userid) throws ClassNotFoundException, SQLException {
				int temp=userid;
				String sql="DELETE FROM SELLCAR WHERE USERID=?";
				PreparedStatement ps=ConnectionManager.getConnection().prepareStatement(sql);
                ps.setInt(2, temp);
                ps.executeUpdate();
                System.out.println("Successfully deleted");
			}
			public void deleteServices(int userid) throws ClassNotFoundException, SQLException {
				int temp=userid;
				String sql="DELETE FROM SERVICES WHERE USERID=?";
				PreparedStatement ps=ConnectionManager.getConnection().prepareStatement(sql);
                ps.setInt(2, temp);
                ps.executeUpdate();
                System.out.println("Successfully deleted");
			}
			public void deleteModify(int userid) throws ClassNotFoundException, SQLException {
				int temp=userid;
				String sql="DELETE FROM MODIFICATIONS WHERE USERID=?";
				PreparedStatement ps=ConnectionManager.getConnection().prepareStatement(sql);
                ps.setInt(2, temp);
                ps.executeUpdate();
                System.out.println("Successfully deleted");
			}
}
