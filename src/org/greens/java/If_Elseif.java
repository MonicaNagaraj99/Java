package org.greens.java;

public class If_Elseif {
 
	
	public static void main(String[] args) {
		
		int a = 20;
				if (a>=35 && a<=45) {
					System.out.println("Pass");
				}
				else if (a>45 && a<75) {
					System.out.println("second class");
				}
				else if (a<100 && a>=75) {
					System.out.println("first class");
				}
				else
					System.out.println("fail");
	}
}
