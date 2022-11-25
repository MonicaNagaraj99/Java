package org.greens.testing;

public interface Mother {
 
	void property5();
	
	void property6();
	
	public static void main(String[] args) {
		Mother mom = new Child();
		
		mom.property5();
		mom.property6();
		
	}
	
}
