package service;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;



public class Service {

		public void CarService() {
	 ArrayList<String> services = new ArrayList<String>(5);

	    System.out.println("These are the services we provide:");
	    services.add("1.General service");
	    services.add("2.Car wash");
	    services.add("3.Painting");
	    services.add("4.Dent removal");
	    services.add("5.Interior care");
		 
	    for (int i = 0; i < 5; i++)
	      {
	         System.out.println(services.get(i).toString());
	      }
	  
	    ArrayList<String> serv=new ArrayList<String>(5);
	    System.out.println("");
        System.out.println("Enter your choices");
        System.out.println("Enter 0 if you don't want that particular service");
        Scanner sc=new Scanner(System.in);
    
            int a=sc.nextInt(); 
            if(a==1) {
            	serv.add("General service");
            }
            int b=sc.nextInt(); 
            if(b==2) {
            	serv.add("Car wash");	
            }
            
            int c=sc.nextInt(); 
            if(c ==3) {
            	serv.add("Painting");
            }  
            int d=sc.nextInt(); 
            if(d ==4) {
            	serv.add("Dent removal");
            } 
            int e=sc.nextInt(); 
            if(e ==5) {
            	serv.add("Interior care");
            } 
            System.out.println(serv);
            System.out.println("");
            System.out.println("Enter 1 if you want to remove any service from the list");
            System.out.println("Enter 2 if you want to add any new service of your choice");
            System.out.println("Enter 3 if you want to replace any service with your choice");
            int f=sc.nextInt();
      
            if(f==1) {
                System.out.println("Assume the first element in the list starts with '0'");
            		serv.remove(sc.nextInt());
            		System.out.println(serv);	            	
            }
            else if(f==2) {	  
            	System.out.println("Enter the service of your choice");
            	serv.add(sc.next());
            	System.out.println(serv);
            }
            else if(f==3) {
                System.out.println("Assume the first element in the list starts with '0'");
            	System.out.println("Enter the index number of which you want to replace");
            	int x=sc.nextInt();
            	System.out.println("Now enter the service of your choice");
            	String y=sc.next();
            	serv.set(x,y);
            	System.out.println(serv);
            }
            try {
		    	String filename="C:\\Users\\user\\Desktop\\demoDetails.pdf";
		    	Document document=new Document();
		    	PdfWriter.getInstance(document,new FileOutputStream(filename));
		    	document.open();
		    	Paragraph para2=new Paragraph(serv.toString());
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
	



