package org.greens.testing;

import java.util.Set;

public class HashSet {
	
    public static void main(String[] args) {
         Set<Object> one = new java.util.HashSet<Object>();
         one.add(2);
         one.add(4);
         one.add(6);
         one.add(1);
         one.add(7);
         one.add(45);
         one.add(90);
         System.out.println("Set 1: " + one);
         
         int size = one.size();
         System.out.println("Size of Set: " + size);
         
         boolean contains = one.contains(7);
         System.out.println("Set contains element 7- " + contains);
         
         one.remove(1);
         System.out.println("Removed element 1: " + one);    
       
         Set<Integer> two =  new java.util.HashSet<Integer>();
         two.add(1);
         two.add(7);
         two.add(6);
         two.add(3);
         two.add(9);
         two.add(2);
         System.out.println("Set Two: " + two);
         
     /*    one.removeAll(two);
         System.out.println(one);
         
         one.retainAll(two);
         System.out.println(one);
         
         one.clear();
         System.out.println(one);   */
         
         one.addAll(two);
         System.out.println(one);
         
         boolean empty = two.isEmpty();
         System.out.println("Set is empty: " +empty);
         
         boolean equals = two.equals(one);
         System.out.println("Set one = Set two: " + equals);
         
         Object[] array = two.toArray();
 		System.out.println("List to array:");
 	    for (Object object2 : array) {
 	    	System.out.println(object2);
 		}
 	    int length = array.length;
 	    System.out.println("Length Of Array: " + length);
 	    
 	    String string = two.toString();
 	    System.out.println("List to string:"+ string);
 	    
 	    int length1 = string.length();
 	    System.out.println("Length Of String: " +length1);  
 
     }

}
//

