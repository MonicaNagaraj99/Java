package org.greens.testing;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch_Exception {
	 public static void main(String[] args) {
			
		 Scanner a = new Scanner(System.in);
		 
		 try {
			System.out.println("What is your register number");
			 byte b = a.nextByte();
			 System.out.println("My register number is " + b);
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException Handled");
		}
		 
}
}
