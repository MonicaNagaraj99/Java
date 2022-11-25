package org.greens.java;

public class Rbi_Methodoverriding {

	public void getRateOfInterest(float a) {
		System.out.println("Home loan interest");
       System.out.println(a);
	}
	
	public static void main(String[] args) {
		Rbi_Methodoverriding i = new Rbi_Methodoverriding();
		
		i.getRateOfInterest(7.66f);
	}
}
