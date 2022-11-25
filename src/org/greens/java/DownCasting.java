package org.greens.java;

public class DownCasting extends UpcastingChild{
    
	@Override
	public void typeCasting() {
    System.out.println("Widening");
    }
	@Override
	public void classCasting() {
		System.out.println("Upcasting");
	}	
	public static void main(String[] args) {
		DownCasting two = (DownCasting) new UpcastingChild();
		
		two.typeCasting();
		two.classCasting();
	}
}
