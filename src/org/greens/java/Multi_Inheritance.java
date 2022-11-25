package org.greens.java;

import org.greens.testing.Single_Inheritance;

public class Multi_Inheritance extends Single_Inheritance{

	private void movie2() {
System.out.println("Vikram");
	}
	public static void main(String[] args) {
		
		Multi_Inheritance r = new Multi_Inheritance();
		
		r.dir1();
		r.movie1();
		r.dir3();
		r.movie2();
		
	}
}
