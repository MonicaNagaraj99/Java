package org.greens.java;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap {
	
	public static void main(String[] args) {
		
		Map<Integer, Character> a = new java.util.LinkedHashMap<Integer , Character>();
		   
		a.put(1, '!');
		a.put(2, null);
		a.put(3, '@');
		a.put(null, '$');
		a.put(4, '%');
		a.put(5, null);
		a.put(3, '%');
		a.put(null,'*');
		
		System.out.println(a);
	
		int size = a.size();
		System.out.println(size);
		
		boolean containsKey = a.containsKey(7);
		System.out.println(containsKey);
		
		boolean containsValue = a.containsValue(null);
		System.out.println(containsValue);
		
		boolean empty = a.isEmpty();
		System.out.println(empty);
		
		Character character = a.get('$');
		System.out.println(character);
		
		Set<Integer> keySet = a.keySet();
		System.out.println(keySet);
		
		Collection<Character> values = a.values();
		System.out.println(values);
		
		Set<Entry<Integer, Character>> entrySet = a.entrySet();
		System.out.println(entrySet);
		
		a.clear();
		System.out.println(a);
		
	}
   
   
}
