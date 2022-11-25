package org.greens.java;
public class AbstractionClass2 extends AbstractionClass1 {

	@Override
	public void a1() {
		System.out.println("Abstraction");
	}

	@Override
	public void a2() {
		System.out.println("Hiding the Implementation Part");
	}

	@Override
	public void a3() {
		System.out.println("Partial Abstraction");
	}

	@Override
	public void a4() {
		System.out.println("Fully Abstraction");
	}
	
    public void a5() {
        System.out.println("It contains only the signature part");
	}
	public static void main(String[] args) {
		AbstractionClass2 z = new AbstractionClass2();
	

		z.a1();
		z.a2();
		z.a3();
		z.a4();
		z.a5();
		z.b1();
		z.b2();
		z.b3();
		z.b4();
	}
}
