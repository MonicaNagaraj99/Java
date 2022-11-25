package org.greens.testing;

public class Child implements Father, Mother {
	@Override
	public void property1() {
		System.out.println("Farm land from grandfather");
	}
	@Override
	public void property2() {
		System.out.println("House from grandfather");
	}
	@Override
	public void property3() {
		System.out.println("Supermarket from father");
	}
	@Override
	public void property4() {
		System.out.println("Penthouse from father");
	}
	@Override
	public void property5() {
		System.out.println("Gold from mother");
	}
	@Override
	public void property6() {
		System.out.println("Bankdeposit from mother");
	}
	public static void main(String[] args) {
     Child son = new Child();
     
     son.property1();
     son.property2();
     son.property3();
     son.property4();
     son.property5();
     son.property6();
	}
}
