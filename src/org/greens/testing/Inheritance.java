package org.greens.testing;

public class Inheritance {

	public void dir1() {
		System.out.println("Maniratnam");
	}
	private void dir2() {
		System.out.println("GVM");
	}
	protected void dir3() {
		System.out.println("Lokesh");
	}
	void dir4() {
		System.out.println("Selva");
	}
	public static void main(String[] args) {

		Inheritance d = new Inheritance();

		d.dir1();
		d.dir2();
		d.dir3();
		d.dir4();
	}
}

