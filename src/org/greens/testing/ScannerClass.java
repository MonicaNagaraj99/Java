package org.greens.testing;

import java.util.Scanner;

public class ScannerClass {

	
	 public static void main(String[] args) {
		
		 Scanner v = new Scanner(System.in);
		 
		 System.out.println("your name");
		 String y = v.nextLine();
		 System.out.println(y);
		 
		 System.out.println("What is your register number");
		 byte regno = v.nextByte();
		 System.out.println("My register number is " );
		 
		 System.out.println("What is your aadhar number");
		 long aadhar = v.nextLong();
		 System.out.println("My aadhar number is " + aadhar);
		 
		 System.out.println("What is your overall percentage");
		 float percentage = v.nextFloat();
		 System.out.println("My overall percentage is " + percentage +'%');
		 
		 System.out.println("What is your total score ");
		 double score = v.nextDouble();
		 System.out.println("My total score is " + score);
		 
		 System.out.println("Boolean is a data type- Is the above statement T/F");
		 boolean dt = v.nextBoolean();
		 System.out.println("This statement is "+ dt);  
	}
}
