package controller;


import java.util.Scanner;

import model.Admin;
import service.User;


public class login {

	public static void main(String[] args) {
		System.out.println("");
		System.out.println("**********--------------------CAR DEALERS & SERVICES--------------------**********");
		System.out.println("");
		System.out.println("1. Admin-Login");
		System.out.println("2. User-Login");

		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
	    if(a==1) {
	    Admin adm=new Admin();
	    adm.AdminLogin1();
		}
		else if(a==2) {
		    User user1=new User();
		    user1.checkUser();
		}
		else if(a!= 1 || a!=2) {
			System.out.println("You have to choose between 1 or 2");
		}
	 
	}
}
