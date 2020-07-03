package service;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class Modify {

	public void CarModify() {
		 ArrayList<String> modifications = new ArrayList<String>(5);

		    System.out.println("These are the modifications we offer:");
		    modifications.add("1.Alloy wheels");
		    modifications.add("2.Window tint");
		    modifications.add("3.Lights");
		    modifications.add("4.Seat covers");
		    modifications.add("5.Spoilers");
			    
		    for (int i = 0; i < 5; i++)
		      {
		         System.out.println(modifications.get(i).toString());
		      }
		    ArrayList<String> mod=new ArrayList<String>(5);
		    System.out.println("");
	        System.out.println("Enter your choices");
	        System.out.println("Enter 0 if you don't want that particular mod");
	        Scanner sc=new Scanner(System.in);
	    
	            int a=sc.nextInt(); 
	            if(a==1) {
	            	mod.add("Alloy wheels");
	            }
	            int b=sc.nextInt(); 
	            if(b==2) {
	            	mod.add("Window tint");	
	            }
	            
	            int c=sc.nextInt(); 
	            if(c ==3) {
	            	mod.add("Lights");
	            }  
	            int d=sc.nextInt(); 
	            if(d ==4) {
	            	mod.add("Seat covers");
	            } 
	            int e=sc.nextInt(); 
	            if(e ==5) {
	            	mod.add("Spoilers");
	            } 
	            System.out.println(mod);
	            System.out.println("");
	            System.out.println("Enter 1 if you want to remove any mod from the list");
	            System.out.println("Enter 2 if you want to add any new mod of your choice");
	            System.out.println("Enter 3 if you want to replace any mod with your choice");
	            int f=sc.nextInt();
	            
	            if(f==1) {
	            	System.out.println("Assume the first element in the list starts with '0'");
	            		mod.remove(sc.nextInt());
	            		System.out.println(mod);	            	
	            }
	            else if(f==2) {	  
	            	
	            	System.out.println("Enter the mod of your choice");
	            	mod.add(sc.next());
	            	System.out.println(mod);
	            }
	            else if(f==3) {
	            	System.out.println("Assume the first element in the list starts with '0'");
	            	System.out.println("Enter the index number of which you want to replace");
	            	int x=sc.nextInt();
	            	System.out.println("Now enter the mod of your choice");
	            	String y=sc.next();
	            	mod.set(x,y);
	            	System.out.println(mod);
	            }
	            try {
			    	String filename="C:\\Users\\user\\Desktop\\demoDetails.pdf";
			    	Document document=new Document();
			    	PdfWriter.getInstance(document,new FileOutputStream(filename));
			    	document.open();
			    	Paragraph para2=new Paragraph(mod.toString());
			    	document.add(para2);
			    	document.close();
			    	System.out.println(" ");
			    	System.out.println("Your pdf file is ready");
			    }
			  catch(Exception e1) {
				  e1.printStackTrace();
			  }
	          }
		  
}
