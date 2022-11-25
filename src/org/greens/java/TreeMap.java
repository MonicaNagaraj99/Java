package org.greens.java;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TreeMap {
	
    public static void main(String[] args) {
		
    	Map<Integer , String> a = new java.util.TreeMap<Integer , String>();
    	
    	a.put(1, "One");
    	a.put(2, "Two");
    	a.put(3, "Three");
    	a.put(4, null);
    	a.put(5, "Four");
    	a.put(6, "Five");
    	a.put(7, null);
    	a.put(4, "Four");
    	//Key - null - throws exception
    	System.out.println(a);
    	
    	int size = a.size();
    	System.out.println(size);
    	
    	boolean containsKey = a.containsKey(6);
    	System.out.println(containsKey);
    	
    	boolean containsValue = a.containsValue("five");
    	System.out.println(containsValue);
    	
    	boolean empty = a.isEmpty();
    	System.out.println(empty);
    	
    	String string = a.get(6);
    	System.out.println(string);
    	
    	Set<Integer> keySet = a.keySet();
    	System.out.println(keySet);
    	
    	Collection<String> values = a.values();
    	System.out.println(values);
    	
    	Set<Entry<Integer, String>> entrySet = a.entrySet();
    	System.out.println(entrySet);
    	
    	a.clear();
    	System.out.println(a);
	}

}
