package org.greens.testing;

public interface Grandfather {
 
	void property1();
	
	void property2();
	
	public static void main(String[] args) {
		Grandfather a = new Child();
		
		a.property1();
		a.property2();
	}
}
