package org.greens.testing;

public class StaticVariable {
 
	static double d = 5.6;
    
	static String f = "Static Variable";
	
	static int a;
	
	 static void method1() {
		int g = 12;
		System.out.println(g);
		d = 60;
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		d = 4.5;
		System.out.println(a);
		System.out.println(d);
		System.out.println(f);
		StaticVariable.method1();
		
		
	}
}
