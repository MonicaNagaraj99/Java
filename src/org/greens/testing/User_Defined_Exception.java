package org.greens.testing;

import java.util.Scanner;

public class User_Defined_Exception {
 public static void main(String[] args) throws ExceptionClass {
	
	 Scanner z = new Scanner(System.in);
	 
	  System.out.println("Enter your age");
	  int nextInt = z.nextInt();
	  System.out.println(nextInt);
	  
	  if (nextInt >18) {
		System.out.println("Eligible");
	} else {
       throw new ExceptionClass("Not Eligible");
	}
}
}
