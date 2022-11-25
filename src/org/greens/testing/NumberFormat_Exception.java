package org.greens.testing;

public class NumberFormat_Exception {

	public static void main(String[] args) {
		
		String a = "O";
		
		try {
			int parseInt = Integer.parseInt(a);
			System.out.println(parseInt);
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException Handled");
			System.out.println("");	
			e.printStackTrace();
		}
	}
}
