package org.greens.java;

public class UpcastingChild extends UpcastingParent {

	public void objectCasting() {
		System.out.println("child class to parent class");
	}

	public void typeCasting() {
		System.out.println("Narrowing");
	}

	public void classCasting() {
		System.out.println("Downcasting");
	}

	public static void main(String[] args) {

		UpcastingChild one = new UpcastingChild();

		one.objectCasting();
		one.typeCasting();
		one.classCasting();
	}
}
