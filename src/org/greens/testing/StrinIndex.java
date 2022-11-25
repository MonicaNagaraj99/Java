package org.greens.testing;

public class StrinIndex {
   public static void main(String[] args) {
	String a = "Exception Handling";
	
	System.out.println(a);
	
	int length = a.length();
	System.out.println(length);
     
	try {
		char charAt = a.charAt(21);
		System.out.println(charAt);
	} catch (StringIndexOutOfBoundsException e) {
		e.printStackTrace();
		
	System.out.println("StringIndexOutOfBoundsException Handled");
	}
	
}
}