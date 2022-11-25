package org.greens.java;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashTable {
      public static void main(String[] args) {
	
	Map<Integer, Boolean> a = new Hashtable<Integer, Boolean>();
	
	a.put(1, false);
	a.put(2, true);
	a.put(3, true);
	a.put(2, false);
	// key -null --- throws exception
	//Value - null -- throws exception
	System.out.println(a);
	
	int size = a.size();
	System.out.println(size);
	
	boolean containsKey = a.containsKey(3);
	System.out.println(containsKey);
	
	boolean containsValue = a.containsValue(true);
	System.out.println(containsValue); // if null throws exception
	
	boolean empty = a.isEmpty();
	System.out.println(empty);
	
	Boolean boolean1 = a.get(7);  
	System.out.println(boolean1);
	
	Set<Integer> keySet = a.keySet();
	System.out.println(keySet);
	
	Collection<Boolean> values = a.values();
	System.out.println(values);
	
	Set<Entry<Integer, Boolean>> entrySet = a.entrySet();
	System.out.println(entrySet);
	
	a.clear();
	System.out.println(a);
	
}
}
