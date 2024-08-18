package com;
 
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CalculatorApp c = new CalculatorImp();
		System.out.println("welcome to calculator project");
		System.out.println("..........");
		
		while(true) {
			
		System.out.println("1:Addition\n2:Substrction\n3:multipication");
		System.out.println("4:Division\n5:Exit");
		System.out.println("Enter:choice");
		 int choice=scan.nextInt();
		 
		 
		 int a=0;
		 int b=0;
		 
		 if(choice>=1 && choice<=4) {
	      System.out.println("Enter first number");
	   a= scan.nextInt();
	      System.out.println("Enter Second number");
	   b= scan.nextInt();
		 }
		 
	  switch(choice) {
	  case 1:
		    int sum=c.add(a,b);
		    System.out.println("sum: "+sum);
		    break;
	  case 2:
		    int sub=c.add(a,b);
		    System.out.println("Diffrence: "+sub);
		    break;
	  case 3:
		    System.out.println("Product: "+c.mul(a, b));
		    break;
	  case 4:
		    System.out.println("Quotient: "+c.div(a, b));
		    break;
	  case 5:
		   System.out.println("Thank you!!");
		   default:
			   System.out.println("Invalid Choice");
		    break;
	  }
	  
		}
	  
	}



}
