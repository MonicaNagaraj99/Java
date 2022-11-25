package org.greens.java;

public class ArithmeticExceptionHandling {
 
	public static void main(String[] args) {
				int a = 15;
				 try {
					System.out.println(a);
					 System.out.println(a/0);
				} catch (ClassCastException e) {
					//e.printStackTrace();
				}
				catch (ArithmeticException e) {
					System.out.println("ArithmeticException handled");
				}
			    finally {
					System.out.println("Finally Block");
				}
		
		 
	}
}
