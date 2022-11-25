package org.greens.java;

public class Array {

	public static void main(String[] args) {
		
		char a[] = new char[10];
		
		a[0]='!';
		a[1]='@';
		a[2]='#';
		a[3]='$';
		a[4]='%';
		a[5]='^';
		a[6]='&';
		a[7]='*';
		a[8]='(';
		a[9]=')';
		
		
		System.out.println(a[3]);
		
		System.out.println("");
		System.out.println("For loop");
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("");
		System.out.println("foreach loop");
		
		for (char i : a) {
			System.out.println(i);
		}
	}
	
}
