package org.greens.testing;

public interface Father extends Grandfather {
 
	void property3();
	
	void property4();
	
	public static void main(String[] args) {
		Father dad = new Child();
		
		dad.property1();
		dad.property2();
		dad.property3();
		dad.property4();
	}
}
