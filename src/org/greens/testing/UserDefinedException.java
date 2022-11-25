package org.greens.testing;

import java.util.Scanner;

public class UserDefinedException {
  
 public static void main(String[] args) throws ExceptionClass {
		 
 	 Scanner v = new Scanner(System.in);
	 
 	 String a = "monica";
	 System.out.println("Enter Your userid");
	 String b = v.next();
	 System.out.println(b);
	 

	 if (a.equals(b)) {
	    System.out.println("Enter Your password");
	} else {
		System.out.println("Incorrect userid");
	}
	 
	 String c = "2345";
	 String d = v.next();
	 System.out.println(d);
	 
	 if (c.equals(d)) {
	    System.out.println("Logged in");
	} else {
		throw new ExceptionClass("Incorrect password");
	}
	 
	 System.out.println("Welcome to ig");
	 }
}
