package org.greens.testing;
import java.util.Scanner;
public class Scanner_datatypes {
	public static void main(String[] args) {
		Scanner jk = new Scanner(System.in);
		
		System.out.println("Enter Patient's name");
		String a = jk.next();
		
		 
		System.out.println("enter adress");
		 jk.nextLine();
		String nextLine = jk.nextLine();
		
		System.out.println("Enter Patient's age");
		byte b = jk.nextByte();
  
		System.out.println("Enter patient's Token number");
		short c = jk.nextShort();
		
		System.out.println("Enter patient's weight");
		int d = jk.nextInt();
		
		System.out.println("Enter Patient's height");
		float e = jk.nextFloat();
					
		System.out.println("Enter Patient's BMI");
		double f =jk.nextDouble();
		
		System.out.println("Enter patient's phone no");
		long g = jk.nextLong();
		
		System.out.println("Patient's body temperature normal -T/F");
        Boolean h = jk.nextBoolean(); 
        
        System.out.println("--------------");
		System.out.println("Patient name: " + a);
		System.out.println(nextLine);
	    System.out.println("Patient age: " + b);
		System.out.println("Token number: "+ c);
		System.out.println("Weight: "+d+"kg");
		System.out.println("Height: "+e +"ft");
		System.out.println("BMI: "+f);
		System.out.println("Phone number: "+g);
		System.out.println(h); 
		}
	}
