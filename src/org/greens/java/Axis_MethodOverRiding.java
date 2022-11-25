package org.greens.java;

public class Axis_MethodOverRiding extends Rbi_Methodoverriding{
	
	@Override
		public void getRateOfInterest(float a) {
			super.getRateOfInterest(a);
		}
	
   public static void main(String[] args) {
	
	   Rbi_Methodoverriding o = new Rbi_Methodoverriding();
	   
	   o.getRateOfInterest(9.02f);
}
}
