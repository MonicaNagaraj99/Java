package org.greens.testing;

public class LocalVariable {

	private void method1() {
		byte a = 17;
		a = 23;

		short b = 40; // initialization must
		b = a;

		System.out.println(a);
		System.out.println(b);
	}
    
	private void m2() {
       int  a = 40 ;   // life cycle within method
       System.out.println(a);
         
	}
	
	public static void main(String[] args) {
		LocalVariable var = new LocalVariable();
		var.method1();
		var.m2();
		StaticVariable.method1();
		System.out.println(StaticVariable.f);
		
		
	}
}
