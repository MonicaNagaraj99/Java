package org.greens.java;

public abstract class AbstractionClass1 {

	public abstract void a1();
	public abstract void a2();
	public abstract void a3();
	public abstract void a4();

	public void b1() {
		System.out.println("Encapsulation");
	}

	public void b2() {
		System.out.println("Inheritance");
	}

	public void b3() {
		System.out.println("Polymorphism");
	}

	public void b4() {
		System.out.println("Abstraction");
	}

	public static void main(String[] args) {
		AbstractionClass1 y = new AbstractionClass2();

		y.a1();
		y.a2();
		y.a3();
		y.a4();
		y.b1();
		y.b2();
		y.b3();
		y.b4();
	}
}
