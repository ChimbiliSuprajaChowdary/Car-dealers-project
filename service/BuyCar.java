package service;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class BuyCar {
	public void Buy() {
		 ArrayList<String> Cars = new ArrayList<String>();

		    System.out.println("Which company would you like to check out:");
		    Cars.add("1.BMW");
		    Cars.add("2.Audi");
		    Cars.add("3.Hyundai");
		    Cars.add("4.Honda");
		    Cars.add("5.Kia");
			 
		    for (int i = 0; i < 5; i++)
		      {
		         System.out.println(Cars.get(i).toString());
		      }
		    ArrayList<String> UserChoice = new ArrayList<String>(5);
		    Scanner sc=new Scanner(System.in);
		    int a=sc.nextInt();
		    if(a==1) {
		    	System.out.println("1. 3-series");
		    	System.out.println("2. 5-series");
		    	System.out.println("3. 7-series");
		    	System.out.println("4. X3");
		    	System.out.println("5. X4");
		    	System.out.println("6. X5");
		    	int b=sc.nextInt();
		    	
		    	if(b==1) {
		    	UserChoice.add("BMW");
		    	UserChoice.add("3-series");
		    	UserChoice.add("50 Lakhs");
		    	System.out.println(UserChoice);
		    	System.out.println("Please visit our showroom for further process");
		    }
		    	else if(b==2) {
			    	UserChoice.add("BMW");
			    	UserChoice.add("5-series");
			    	UserChoice.add("70 Lakhs");
			    	System.out.println(UserChoice);
			    	System.out.println("Please visit our showroom for further process");
			    }
		    	else if(b==3) {
			    	UserChoice.add("BMW");
			    	UserChoice.add("7-series");
			    	UserChoice.add("1.5 Crores");
			    	System.out.println(UserChoice);
			    	System.out.println("Please visit our showroom for further process");
			    }
		    	else if(b==4) {
			    	UserChoice.add("BMW");
			    	UserChoice.add("X3");
			    	UserChoice.add("60 Lakhs");
			    	System.out.println(UserChoice);
			    	System.out.println("Please visit our showroom for further process");
			    }
		    	else if(b==5) {
			    	UserChoice.add("BMW");
			    	UserChoice.add("X4");
			    	UserChoice.add("65 Lakhs");
			    	System.out.println(UserChoice);
			    	System.out.println("Please visit our showroom for further process");
			    }
		    	else if(b==6) {
			    	UserChoice.add("BMW");
			    	UserChoice.add("X5");
			    	UserChoice.add("80 Lakhs");
			    	System.out.println(UserChoice);
			    	System.out.println("Please visit our showroom for further process");
			    }
		    }
		    	else if(a==2) {
				    	System.out.println("1. A3");
				    	System.out.println("2. A5");
				    	System.out.println("3. A6");
				    	System.out.println("4. A8");
				    	System.out.println("5. Q3");
				    	System.out.println("6. Q5");
				    	int c=sc.nextInt();
				    	if(c==1) {
				    	UserChoice.add("AUDI");
				    	UserChoice.add("A3");
				    	UserChoice.add("30 Lakhs");
				    	System.out.println(UserChoice);
				    	System.out.println("Please visit our showroom for further process");
				    }
				    	else if(c==2) {
				    		UserChoice.add("AUDI");
					    	UserChoice.add("A5");
					    	UserChoice.add("55 Lakhs");
					    	System.out.println(UserChoice);
					    	System.out.println("Please visit our showroom for further process");
					    }
				    	else if(c==3) {
				    		UserChoice.add("AUDI");
					    	UserChoice.add("A6");
					    	UserChoice.add("60 Lakhs");
					    	System.out.println(UserChoice);
					    	System.out.println("Please visit our showroom for further process");
					    }
				    	else if(c==4) {
				    		UserChoice.add("AUDI");
					    	UserChoice.add("A8");
					    	UserChoice.add("1.5 crores");
					    	System.out.println(UserChoice);
					    	System.out.println("Please visit our showroom for further process");
					    }
				    	else if(c==5) {
				    		UserChoice.add("AUDI");
					    	UserChoice.add("Q3");
					    	UserChoice.add("35 Lakhs");
					    	System.out.println(UserChoice);
					    	System.out.println("Please visit our showroom for further process");
					    }
				    	else if(c==6) {
				    		UserChoice.add("AUDI");
					    	UserChoice.add("Q5");
					    	UserChoice.add("45 Lakhs");
					    	System.out.println(UserChoice);
					    	System.out.println("Please visit our showroom for further process");
					    }
		    	}
				   else if(a==3) {
					    	System.out.println("1. Creta");
					    	System.out.println("2. Verna");
					    	System.out.println("3. Elantra");
					    	System.out.println("4. Venue");
					    	System.out.println("5. i20");
					    	System.out.println("6. i10");
					    	int d=sc.nextInt();
					    	if(d==1) {
					    	UserChoice.add("Hyundai");
					    	UserChoice.add("Creta");
					    	UserChoice.add("16.8 Lakhs");
					    	System.out.println(UserChoice);
					    	System.out.println("Please visit our showroom for further process");
					    }
					          else if(d==2) {
					        	  UserChoice.add("Hyundai");
							    	UserChoice.add("Verna");
							    	UserChoice.add("14.5 Lakhs");
						    	System.out.println(UserChoice);
						    	System.out.println("Please visit our showroom for further process");
						    }
					    	else if(d==3) {
					    		UserChoice.add("Hyundai");
						    	UserChoice.add("Elantra");
						    	UserChoice.add("20 Lakhs");
						    	System.out.println(UserChoice);
						    	System.out.println("Please visit our showroom for further process");
						    }
					    	else if(d==4) {
					    		UserChoice.add("Hyundai");
						    	UserChoice.add("Venue");
						    	UserChoice.add("10 Lakhs");
						    	System.out.println(UserChoice);
						    	System.out.println("Please visit our showroom for further process");
						    }
					    	else if(d==5) {
					    		UserChoice.add("Hyundai");
						    	UserChoice.add("i20");
						    	UserChoice.add("9 Lakhs");
						    	System.out.println(UserChoice);
						    	System.out.println("Please visit our showroom for further process");
						    }
					    	else if(d==6) {
					    		UserChoice.add("Hyundai");
						    	UserChoice.add("i10");
						    	UserChoice.add("7 Lakhs");
						    	System.out.println(UserChoice);
						    	System.out.println("Please visit our showroom for further process");
						    }
				   }
					      else if(a==4) {
							    	System.out.println("1. City");
							    	System.out.println("2. CR-V");
							    	System.out.println("3. Civic");
							    	System.out.println("4. Amaze");
							    	System.out.println("5. Jazz");
							    
							    	int e=sc.nextInt();
							    	if(e==1) {
							    	UserChoice.add("Honda");
							    	UserChoice.add("City");
							    	UserChoice.add("14 Lakhs");
							    	System.out.println(UserChoice);
							    	System.out.println("Please visit our showroom for further process");
							    }
							          else if(e==2) {
							        	  UserChoice.add("Honda");
									    	UserChoice.add("CR-V");
									    	UserChoice.add("23 Lakhs");
								    	System.out.println(UserChoice);
								    	System.out.println("Please visit our showroom for further process");
								    }
							    	else if(e==3) {
							    		UserChoice.add("Honda");
								    	UserChoice.add("Civic");
								    	UserChoice.add("20 Lakhs");
								    	System.out.println(UserChoice);
								    	System.out.println("Please visit our showroom for further process");
								    }
							    	else if(e==4) {
							    		UserChoice.add("Honda");
								    	UserChoice.add("Amaze");
								    	UserChoice.add("10 Lakhs");
								    	System.out.println(UserChoice);
								    	System.out.println("Please visit our showroom for further process");
								    }
							    	else if(e==5) {
							    		UserChoice.add("Honda");
								    	UserChoice.add("Jazz");
								    	UserChoice.add("8 Lakhs");
								    	System.out.println(UserChoice);
								    	System.out.println("Please visit our showroom for further process");
								    }
					      }
							        else if(a==5) {
								    	System.out.println("1. Seltos");
								    	System.out.println("2. Carnival");
								    
								    
								    	int f=sc.nextInt();
								    	if(f==1) {
								    	UserChoice.add("Kia");
								    	UserChoice.add("Seltos");
								    	UserChoice.add("16 Lakhs");
								    	System.out.println(UserChoice);
								    	System.out.println("Please visit our showroom for further process");
								    }
								          else if(f==2) {
								        	  UserChoice.add("Kia");
										    	UserChoice.add("Carnival");
										    	UserChoice.add("30 Lakhs");
									    	System.out.println(UserChoice);
									    	System.out.println("Please visit our showroom for further process");
									    }
								  
                 }
		    try {
		    	String filename="C:\\Users\\user\\Desktop\\demoDetails.pdf";
		    	Document document=new Document();
		    	PdfWriter.getInstance(document,new FileOutputStream(filename));
		    	document.open();
		    	Paragraph para2=new Paragraph(UserChoice.toString());
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
