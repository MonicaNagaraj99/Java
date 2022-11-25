package org.greens.java;

public class NestedLoop {
 
	public static void main(String[] args) {
		
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
		for (int v = 4; v >= 1 ; v--) {
			for (int u = 1; u <= v; u++) {
				
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}
}
