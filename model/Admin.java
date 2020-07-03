package model;

import java.util.Scanner;

public class Admin {

	public void AdminLogin1() {

		String Username = "itsnandan";
		String Password = "12345678";

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username : ");
		String username = sc.next();
	    
		System.out.println("Enter Password : ");
		String password = sc.next();

		if (username.equals(Username) && password.equals(Password)) {
			System.out.println("Access Granted! Welcome Nandan!");
		}

		else if (username.equals(Username)) {
			System.out.println("Invalid Password!");
		} else if (password.equals(Password)) {
			System.out.println("Invalid Username!");
		} else {
			System.out.println("Invalid Username & Password!");
		}
		
	}
}
