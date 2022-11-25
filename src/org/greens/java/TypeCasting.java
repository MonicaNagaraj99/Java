package org.greens.java;

public class TypeCasting {

	public static void main(String[] args) {
		
		//widening
		
		byte a = 127;
		short b = a;
		System.out.println(b);
		
		//narrowing
		
		short c = 4000;
		byte d = (byte) c;
		System.out.println(d);
		
		short e = 124;
		byte f = (byte) e;
		System.out.println(f);
	}
}

