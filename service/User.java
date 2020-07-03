package service;

import java.io.FileOutputStream;
import java.util.Scanner;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class User {
	String username;
    String password;
    boolean hasNum=false;
    boolean hasUpp=false;

	
	public void checkUser() {
	            
	            Scanner sc=new Scanner(System.in);
	            
		        System.out.println("Enter username: ");
		        username=sc.next();
		       
		        System.out.println("Enter password: ");
		        System.out.println("(*Make sure your password contains atleast 1 number and 1 uppercase letter*)");
		        password=sc.next();
		        		      
		        if (password.length() < 8) {
		        	System.out.println("Password must be at least 8 characters");
		        }
		        else if(password.length() > 20) {
			   	      System.out.println("Password should not exceed 20 characters"); 
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
		        if(hasNum  && hasUpp == true) {
		        		System.out.println("Successfully logged in");
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
		        				buycar.Buy();
		        			}
		        			else if(c==2) {
			        			SellCar sellcar=new SellCar();
			        			sellcar.Sell();
			        		}
		        			else if(c==3) {
		        			Service serv=new Service();
		        			serv.CarService();
		        			}
		        			else if(c==4) {
		        				Modify mod=new Modify();
		        				mod.CarModify();	
		        			}
		        			
		        			else if(c!= 1 || c!=2 ||c!=3 ||c!=4) {
		        				System.out.println("You have to choose between 1 or 2");
		        			}
		        		}
		        		  try {
		  			    	String filename="C:\\Users\\user\\Desktop\\demo.pdf";
		  			    	Document document=new Document();
		  			    	PdfWriter.getInstance(document,new FileOutputStream(filename));
		  			    	document.open();
		  			    	Paragraph para1=new Paragraph("Username : "+ username +" "+","+" "+ "Password : "+password);
		  			    	document.add(para1);
		  			    	document.close();
		  			    	System.out.println(" ");
		  			    	System.out.println("User details are stored in another pdf file");
		  			    }
		  			  catch(Exception e) {
		  				  e.printStackTrace();
		  			  }
		        	}
		        
		        else 
		            {
		        	System.out.println("Password did'nt meet the requirements");
		        	}
		           }  
		      
	}
}
