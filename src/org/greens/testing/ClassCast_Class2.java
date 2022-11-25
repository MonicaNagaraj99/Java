package org.greens.testing;

public class ClassCast_Class2 extends ClassCast_Class1{
 
	@Override
	public void m1() {
		System.out.println("Parent class 1 Method");
	}
	@Override
	public void m2() {
		System.out.println("ParentClass 2 Method");
	}
	
	public static void main(String[] args) {
		
		try {
			ClassCast_Class2 b = (ClassCast_Class2) new ClassCast_Class1();
			b.m1();
			b.m2();
		} catch (ClassCastException e) {
			// e.printStackTrace();
			System.out.println("ClasscastException handled");
		}
        
	}
}
