  package org.greens.testing;

import java.util.List;
import java.util.Collections;
import java.util.LinkedList;

public class Linked_List{
	public static void main(String[] args) {

		List<Object> a = new LinkedList<Object>();
		a.add(25);
		a.add(.356);
		a.add('^');
		a.add("List");
		a.add(false);
		a.add(50);
		a.add(25);
		a.add('.');
		a.add(4, 75);
		System.out.println("List1:" + a);

		List<Integer> b = new LinkedList<Integer>();
		b.add(50);
		b.add(77);
		b.add(6);
		b.add(75);
		b.add(60);
		System.out.println("List b" + b);

		//a.removeAll(b);
	    //System.out.println(a);
	           
	   // a.retainAll(b);
	   // System.out.println(a);
	           
	 //   a.clear();
	   // System.out.println(a);
	           
		a.addAll(b);
		System.out.println("List a + List b: " + a);

		boolean empty = b.isEmpty();
		System.out.println("Isempty: " + empty);

		boolean equals = b.equals(a);
		System.out.println("List a = List b: " + equals);

		Collections.sort(b);
		System.out.println("sort: " + b);

		Object[] array = b.toArray();
		System.out.println("List to array:");
		for (Object object2 : array) {
			System.out.println(object2);
		}
		int length = array.length;
		System.out.println("Length Of Array: " + length);

		String string = b.toString();
		System.out.println("List to string:" + string);

		int length1 = string.length();
		System.out.println("Length Of String: " + length1);  
		
		int size = a.size();
		System.out.println("Size of List: " + size);

		int indexOf = a.indexOf(50);
		System.out.println("Index of 50: " + indexOf);

		int lastIndexOf = a.lastIndexOf(25);
		System.out.println("LastIndexOF 25: " + lastIndexOf);

		int lastIndexOf1 = a.lastIndexOf(100);
		System.out.println("LastIndexOF ivalid element: " + lastIndexOf1);

		boolean contains = a.contains('.');
		System.out.println("Contains: " + contains);

		Object object = a.get(2);
		System.out.println("get value in index 2: " + object);

		a.set(5, '&');
		System.out.println("set: " + a);

		a.remove(7);
		System.out.println("Removed element 7: " + a); 

	}

}

