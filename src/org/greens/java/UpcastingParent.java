package org.greens.java;

public class UpcastingParent {

	public void typesOfCasting() {
	     System.out.println("Typecasting,Classcasting");
		}
	
		public void typeCasting() {
			System.out.println("Widening");
	    }
		
		public void classCasting() {
	     System.out.println("Upcasting");
		}
		
		public static void main(String[] args) {
			
			UpcastingParent i = new UpcastingChild();
		
			i.typesOfCasting();
			i.typeCasting();
			i.classCasting();
		}
}
