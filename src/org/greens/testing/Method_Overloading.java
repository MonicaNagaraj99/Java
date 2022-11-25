package org.greens.testing;

public class Method_Overloading extends Access_Modifiers{

	private void access() {
		System.out.println("Private method-cannot call outside the class");
	}

	public static void main(String[] args) {

		Method_Overloading A = new Method_Overloading();

		A.access();
		A.green();
		A.blue();
		A.yellow();
 
	}
}
