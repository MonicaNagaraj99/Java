package org.greens.java;

public class SBI_MethodOverRiding extends Rbi_Methodoverriding {

	@Override
	public void getRateOfInterest(float a) {
		System.out.println("SBI Home loan interest");
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		SBI_MethodOverRiding e = new SBI_MethodOverRiding();
		
		e.getRateOfInterest(7.54f);
	}
}
