package org.greens.java;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Collections {
	
	public static void main(String[] args) {
		Map<Integer, Integer> a = new HashMap<Integer, Integer>();
		
		a.put(null, 100);
		a.put(1, 101);
		a.put(2, 102);
		a.put(3, null);
		a.put(4, 104);
		a.put(null, 103);
		a.put(5, 102);
		System.out.println("Map:" + a);
		
		int size = a.size();
		System.out.println(size);
		
		boolean containsKey = a.containsKey(null);
		System.out.println(containsKey);
		
		boolean containsValue = a.containsValue(103);
		System.out.println(containsValue);
		
		boolean empty = a.isEmpty();
		System.out.println(empty);
		
		Integer integer = a.get(4);
		System.out.println(integer);
		
		Set<Integer> keySet = a.keySet();
		System.out.println(keySet);
		
		Collection<Integer> values = a.values();
		System.out.println(values);
		
		Set<Entry<Integer, Integer>> entrySet = a.entrySet();
		System.out.println(entrySet);
		
		a.clear();
		System.out.println();
	}
 }
