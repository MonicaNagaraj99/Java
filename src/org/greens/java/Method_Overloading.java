package org.greens.java;

public class Method_Overloading {

	public void methodOverloading() {
        System.out.println("Compile-time Polymorphism");
	}
	public void methodOverloading(byte a,short b) {
		System.out.println(a);
		System.out.println(b);
	}
	 public void methodOverloading(int c, long d) {
		System.out.println(c);
		System.out.println(d);
	 }
	public void methodOverloading(float e, double f) {
		System.out.println(e);
		System.out.println(f);
	}
	private void methodOverloading(char g , String h) {
		System.out.println(g);
		System.out.println(h);
	}
	public void methodOverloading(String i , char j) {
		System.out.println(i);
		System.out.println(j);
	}
	public static void main(String[] args) {
		Method_Overloading z = new Method_Overloading();
		
		z.methodOverloading();
		z.methodOverloading(2, 23456);
		z.methodOverloading(20, 2000l);
		z.methodOverloading(3.3f, 5.0);
		z.methodOverloading('M', "string");
		z.methodOverloading("Non primitive" , '!');
	}
}
