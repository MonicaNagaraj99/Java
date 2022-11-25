package org.greens.java;

public class Parent_Hierarchical extends Hybrid {

	public void type3() {
		System.out.println("Hierarchical");
	}
	public void type4() {
		System.out.println("Multiple");
	}
	public void type5() {
		System.out.println("Hybrid");
	}
	public static void main(String[] args) {

		Parent_Hierarchical b = new Parent_Hierarchical();

		b.types();
		b.type1();
		b.type2();
		b.type3();
		b.type4();
		b.type5();
	}
}
