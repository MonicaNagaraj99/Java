package org.greens.java;

public class ICICI_MthodOverRiding extends Rbi_Methodoverriding {

	@Override
	public void getRateOfInterest(float a) {
		super.getRateOfInterest(a);
	}
	
	public static void main(String[] args) {
		Rbi_Methodoverriding u = new Rbi_Methodoverriding();
		
		u.getRateOfInterest(8.45f);
	}
}
