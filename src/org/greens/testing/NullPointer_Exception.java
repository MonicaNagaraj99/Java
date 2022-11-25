package org.greens.testing;

import java.util.Set;
import java.util.TreeSet;

public class NullPointer_Exception {
	public static void main(String[] args) {
		
		Set<Integer> a = new TreeSet<Integer>();
		try {
		a.add(null);
		a.add(4);
		a.add(56);
		
		
			System.out.println(a);
		} catch (NullPointerException e) {
			//e.printStackTrace();
			System.out.println("NullPointerException Handled");
		}
		finally {
			System.out.println("Finally Block");
		}
	}

}
