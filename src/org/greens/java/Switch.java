package org.greens.java;

public class Switch {

	public static void main(String[] args) {
		
		int  a = 44;
		
		switch(a) {
		
		case 38:
			System.out.println("small");
			break;
		case 40:
			System.out.println("medium");
			break;
		case 42:
			System.out.println("large");
			break;
		case 44:
			System.out.println("Extra large");
			break;
			default:
				break;
		}
				
	}
}
