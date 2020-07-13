package service;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import utility.ConnectionManager;

public class SellCar {
	
	public void Sell(int userid,String username) throws SQLException, ClassNotFoundException {
		    Scanner sc=new Scanner(System.in);
		    ArrayList<String> Cars1 = new ArrayList<String>();
		    System.out.println("Enter sell-id");
	    	int id=sc.nextInt();  
		    System.out.println("Which company is your car?");
		    Cars1.add("1.BMW");
		    Cars1.add("2.Audi");
		    Cars1.add("3.Hyundai");
		    Cars1.add("4.Honda");
		    Cars1.add("5.Kia");
			 
		    for (int i = 0; i < 5; i++)
		      {
		         System.out.println(Cars1.get(i).toString());
		      }
		    ArrayList<String> UserChoice1 = new ArrayList<String>(5);		     	
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
		    	UserChoice1.add("BMW");
		    	UserChoice1.add("3-series");
		    	UserChoice1.add("Asking price is 25 Lakhs");		    	
		    	System.out.println(UserChoice1);
		    	System.out.println("At what price do you wanna sell?");
		    	String x=sc.next();
		    	UserChoice1.add("Seller price is "+ x);
		    	System.out.println(UserChoice1);
		    	System.out.println("We will let you know if any buyer is interested");		    	
		    }
		    	else if(b==2) {
			    	UserChoice1.add("BMW");
			    	UserChoice1.add("5-series");
			    	UserChoice1.add("Asking price is 35 Lakhs");
			    	System.out.println(UserChoice1);
			    	System.out.println("At what price do you wanna sell?");
			    	String x=sc.next();
			    	UserChoice1.add("Seller price is "+x);
			    	System.out.println(UserChoice1);
			    	System.out.println("We will let you know if any buyer is interested");
			    }
		    	
		    	else if(b==3) {
			    	UserChoice1.add("BMW");
			    	UserChoice1.add("7-series");
			    	UserChoice1.add("Asking price is 80 Lakhs");
			    	System.out.println(UserChoice1);
			    	System.out.println("At what price do you wanna sell?");
			    	String x=sc.next();
			    	UserChoice1.add("Seller price is "+x);
			    	System.out.println(UserChoice1);
			    	System.out.println("We will let you know if any buyer is interested");		    	
			    }
		    	else if(b==4) {
			    	UserChoice1.add("BMW");
			    	UserChoice1.add("X3");
			    	UserChoice1.add("Asking price is 35 Lakhs");
			    	System.out.println(UserChoice1);
			    	System.out.println("At what price do you wanna sell?");
			    	String x=sc.next();
			    	UserChoice1.add("Seller price is "+x);
			    	System.out.println(UserChoice1);
			    	System.out.println("We will let you know if any buyer is interested");			    	
			    }
		    	
		    	else if(b==5) {
			    	UserChoice1.add("BMW");
			    	UserChoice1.add("X4");
			    	UserChoice1.add("Asking price is 40 Lakhs");
			    	System.out.println(UserChoice1);
			    	System.out.println("At what price do you wanna sell?");
			    	String x=sc.next();
			    	UserChoice1.add("Seller price is "+x);
			    	System.out.println(UserChoice1);
			    	System.out.println("We will let you know if any buyer is interested");			    	
			    }
		    	
		    	else if(b==6) {
			    	UserChoice1.add("BMW");
			    	UserChoice1.add("X5");
			    	UserChoice1.add("Asking price is 50 Lakhs");
			    	System.out.println(UserChoice1);
			    	System.out.println("At what price do you wanna sell?");
			    	String x=sc.next();
			    	UserChoice1.add("Seller price is "+x);
			    	System.out.println(UserChoice1);
			    	System.out.println("We will let you know if any buyer is interested");			    	
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
				    	UserChoice1.add("AUDI");
				    	UserChoice1.add("A3");
				    	UserChoice1.add("Asking price is 20 Lakhs");
				    	System.out.println(UserChoice1);
				    	System.out.println("At what price do you wanna sell?");
				    	String x=sc.next();
				    	UserChoice1.add("Seller price is "+x);
				    	System.out.println(UserChoice1);
				    	System.out.println("We will let you know if any buyer is interested");			    	
				    }
				    	
				    	else if(c==2) {
				    		UserChoice1.add("AUDI");
					    	UserChoice1.add("A5");
					    	UserChoice1.add("Asking price is 30 Lakhs");
					    	System.out.println(UserChoice1);
					    	System.out.println("At what price do you wanna sell?");
					    	String x=sc.next();
					    	UserChoice1.add("Seller price is "+x);
					    	System.out.println(UserChoice1);
					    	System.out.println("We will let you know if any buyer is interested");
					    	
					    }
				    	else if(c==3) {
				    		UserChoice1.add("AUDI");
					    	UserChoice1.add("A6");
					    	UserChoice1.add("Asking price is 40 Lakhs");
					    	System.out.println(UserChoice1);
					    	System.out.println("At what price do you wanna sell?");
					    	String x=sc.next();
					    	UserChoice1.add("Seller price is "+x);
					    	System.out.println(UserChoice1);
					    	System.out.println("We will let you know if any buyer is interested");
					    	
					    }
				    	else if(c==4) {
				    		UserChoice1.add("AUDI");
					    	UserChoice1.add("A8");
					    	UserChoice1.add("Asking price is 85 Lakhs");
					    	System.out.println(UserChoice1);
					    	System.out.println("At what price do you wanna sell?");
					    	String x=sc.next();
					    	UserChoice1.add("Seller price is "+x);
					    	System.out.println(UserChoice1);
					    	System.out.println("We will let you know if any buyer is interested");
					    	
					    }
				    	else if(c==5) {
				    		UserChoice1.add("AUDI");
					    	UserChoice1.add("Q3");
					    	UserChoice1.add("Asking price is 30 Lakhs");
					    	System.out.println(UserChoice1);
					    	System.out.println("At what price do you wanna sell?");
					    	String x=sc.next();
					    	UserChoice1.add("Seller price is "+x);
					    	System.out.println(UserChoice1);
					    	System.out.println("We will let you know if any buyer is interested");					    	
					    }
				    	else if(c==6) {
				    		UserChoice1.add("AUDI");
					    	UserChoice1.add("Q5");
					    	UserChoice1.add("Asking price is 35 Lakhs");
					    	System.out.println(UserChoice1);
					    	System.out.println("At what price do you wanna sell?");
					    	String x=sc.next();
					    	UserChoice1.add("Seller price is "+x);
					    	System.out.println(UserChoice1);
					    	System.out.println("We will let you know if any buyer is interested");
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
					    	UserChoice1.add("Hyundai");
					    	UserChoice1.add("Creta");
					    	UserChoice1.add("Asking price is 11 Lakhs");
					    	System.out.println(UserChoice1);
					    	System.out.println("At what price do you wanna sell?");
					    	String x=sc.next();
					    	UserChoice1.add("Seller price is "+x);
					    	System.out.println(UserChoice1);
					    	System.out.println("We will let you know if any buyer is interested");
					    }
					          else if(d==2) {
					        	  UserChoice1.add("Hyundai");
							    	UserChoice1.add("Verna");
							    	UserChoice1.add("Asking price is 10 Lakhs");
						    	System.out.println(UserChoice1);
						    	System.out.println("At what price do you wanna sell?");
						    	String x=sc.next();
						    	UserChoice1.add("Seller price is "+x);
						    	System.out.println(UserChoice1);
						    	System.out.println("We will let you know if any buyer is interested");
						    }
					    	else if(d==3) {
					    		UserChoice1.add("Hyundai");
						    	UserChoice1.add("Elantra");
						    	UserChoice1.add("Asking price is 14 Lakhs");
						    	System.out.println(UserChoice1);
						    	System.out.println("At what price do you wanna sell?");
						    	String x=sc.next();
						    	UserChoice1.add("Seller price is "+x);
						    	System.out.println(UserChoice1);
						    	System.out.println("We will let you know if any buyer is interested");
						    }
					    	else if(d==4) {
					    		UserChoice1.add("Hyundai");
						    	UserChoice1.add("Venue");
						    	UserChoice1.add("Asking price is 7 Lakhs");
						    	System.out.println(UserChoice1);
						    	System.out.println("At what price do you wanna sell?");
						    	String x=sc.next();
						    	UserChoice1.add("Seller price is "+x);
						    	System.out.println(UserChoice1);
						    	System.out.println("We will let you know if any buyer is interested");
						    }
					    	else if(d==5) {
					    		UserChoice1.add("Hyundai");
						    	UserChoice1.add("i20");
						    	UserChoice1.add("Asking price is 6 Lakhs");
						    	System.out.println(UserChoice1);
						    	System.out.println("At what price do you wanna sell?");
						    	String x=sc.next();
						    	UserChoice1.add("Seller price is "+x);
						    	System.out.println(UserChoice1);
						    	System.out.println("We will let you know if any buyer is interested");
						    }
					    	else if(d==6) {
					    		UserChoice1.add("Hyundai");
						    	UserChoice1.add("i10");
						    	UserChoice1.add("Asking price is 4 Lakhs");
						    	System.out.println(UserChoice1);
						    	System.out.println("At what price do you wanna sell?");
						    	String x=sc.next();
						    	UserChoice1.add("Seller price is "+x);
						    	System.out.println(UserChoice1);
						    	System.out.println("We will let you know if any buyer is interested");
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
							    	UserChoice1.add("Honda");
							    	UserChoice1.add("City");
							    	UserChoice1.add("Asking price is 11 Lakhs");
							    	System.out.println(UserChoice1);
							    	System.out.println("At what price do you wanna sell?");
							    	String x=sc.next();
							    	UserChoice1.add("Seller price is "+x);
							    	System.out.println(UserChoice1);
							    	System.out.println("We will let you know if any buyer is interested");
							    }
							          else if(e==2) {
							        	  UserChoice1.add("Honda");
									    	UserChoice1.add("CR-V");
									    	UserChoice1.add("Asking price is 15 Lakhs");
								    	System.out.println(UserChoice1);
								    	System.out.println("At what price do you wanna sell?");
								    	String x=sc.next();
								    	UserChoice1.add("Seller price is "+x);
								    	System.out.println(UserChoice1);
								    	System.out.println("We will let you know if any buyer is interested");
								    }
							    	else if(e==3) {
							    		UserChoice1.add("Honda");
								    	UserChoice1.add("Civic");
								    	UserChoice1.add("Asking price is 14 Lakhs");
								    	System.out.println(UserChoice1);
								    	System.out.println("At what price do you wanna sell?");
								    	String x=sc.next();
								    	UserChoice1.add("Seller price is "+x);
								    	System.out.println(UserChoice1);
								    	System.out.println("We will let you know if any buyer is interested");
								    }
							    	else if(e==4) {
							    		UserChoice1.add("Honda");
								    	UserChoice1.add("Amaze");
								    	UserChoice1.add("Asking price is 7 Lakhs");
								    	System.out.println(UserChoice1);
								    	System.out.println("At what price do you wanna sell?");
								    	String x=sc.next();
								    	UserChoice1.add("Seller price is "+x);
								    	System.out.println(UserChoice1);
								    	System.out.println("We will let you know if any buyer is interested");
								    }
							    	else if(e==5) {
							    		UserChoice1.add("Honda");
								    	UserChoice1.add("Jazz");
								    	UserChoice1.add("Asking price is 6 Lakhs");
								    	System.out.println(UserChoice1);
								    	System.out.println("At what price do you wanna sell?");
								    	String x=sc.next();
								    	UserChoice1.add("Seller price is "+x);
								    	System.out.println(UserChoice1);
								    	System.out.println("We will let you know if any buyer is interested");
								    }
					      }
							        else if(a==5) {
								    	System.out.println("1. Seltos");
								    	System.out.println("2. Carnival");
								    
								    
								    	int f=sc.nextInt();
								    	if(f==1) {
								    	UserChoice1.add("Kia");
								    	UserChoice1.add("Seltos");
								    	UserChoice1.add("Asking price is 12 Lakhs");
								    	System.out.println(UserChoice1);
								    	System.out.println("At what price do you wanna sell?");
								    	String x=sc.next();
								    	UserChoice1.add("Seller price is "+x);
								    	System.out.println(UserChoice1);
								    	System.out.println("We will let you know if any buyer is interested");
								    }
								          else if(f==2) {
								        	  UserChoice1.add("Kia");
										    	UserChoice1.add("Carnival");
										    	UserChoice1.add("22 Lakhs");
									    	System.out.println(UserChoice1);
									    	System.out.println("At what price do you wanna sell?");
									    	String x=sc.next();
									    	UserChoice1.add("Seller price is "+x);
									    	System.out.println(UserChoice1);
									    	System.out.println("We will let you know if any buyer is interested");
									    }
								  
                }
		    try {
		    Connection con=ConnectionManager.getConnection();
	    	
	    	String sql="INSERT INTO SELLCAR(ID,USERID,COMPANY,MODEL,ASKINGPRICE,SELLERPRICE)VALUES(?,?,?,?,?,?)";
	    	PreparedStatement st=con.prepareStatement(sql);
	    	st.setInt(1,id);
	    	st.setInt(2,userid);
            String company=UserChoice1.get(0);
	    	st.setString(3,company);
	    	String model=UserChoice1.get(1);
	    	st.setString(4,model);
	      	String askingprice=UserChoice1.get(2);
    	    st.setString(5,askingprice);
    	    String sellingprice=UserChoice1.get(3);
    	    st.setString(6,sellingprice);
	    	st.executeUpdate();
	    	con.close();
	    	System.out.println("Your details are stored");
	      }
             catch(Exception e) {
                 	System.out.println("SellcarID already exists");
                    }
		    try {
		    	String filename="C:\\Users\\user\\Desktop\\demoDetails.pdf";
		    	Document document=new Document();
		    	PdfWriter.getInstance(document,new FileOutputStream(filename));
		    	document.open();
		    	Paragraph para1=new Paragraph("CAR DEALERS & SERVICES:");
		        document.add(para1);
		    	Paragraph para2=new Paragraph(userid+" - "+" "+ " "+ username+" - " +" "+" "+UserChoice1.toString());
		    	document.add(para2);
		    	document.close();
		    	System.out.println(" ");
		    	System.out.println("Your pdf file is ready");
		    }
		  catch(Exception e) {
			  e.printStackTrace();
		  }
           }
 

}
