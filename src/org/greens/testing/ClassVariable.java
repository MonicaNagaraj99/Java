package org.greens.testing;

public class ClassVariable {

	int a = 50;
	float b;
    

	private void method1() {
		int c = 30;
		a = 60;  // lifecycle through out the class
		System.out.println(c);
		System.out.println(a);
		

	}

	public static void main(String[] args) {
	
		ClassVariable var = new ClassVariable();
         var.b = 6.7f;
		System.out.println(var.a);
		System.out.println(var.b);
		var.method1();

	}
}
