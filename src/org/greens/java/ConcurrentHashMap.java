package org.greens.java;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class ConcurrentHashMap {
    public static void main(String[] args) {
		
    Map<Integer, Double> a = new java.util.concurrent.ConcurrentHashMap<Integer , Double>();
    
    a.put(1, 0.34);
    a.put(2, 7.5);
    a.put(3, 0.34);
    a.put(4, 5.7);
    a.put(2, 4.9);
    
    System.out.println(a);
    
    int size = a.size();
	System.out.println(size);
	
	boolean containsKey = a.containsKey(3);
	System.out.println(containsKey);
	
	boolean containsValue = a.containsValue(5.7);
	System.out.println(containsValue); // if null throws exception
	
	boolean empty = a.isEmpty();
	System.out.println(empty);
	
	Double double1 = a.get(4);
	System.out.println(double1);
	
	Set<Integer> keySet = a.keySet();
	System.out.println(keySet);
	
	Collection<Double> values = a.values();
	System.out.println(values);
	
	Set<Entry<Integer, Double>> entrySet = a.entrySet();
	System.out.println(entrySet);
	
	a.clear();
	System.out.println(a);
    
    
	}
}
