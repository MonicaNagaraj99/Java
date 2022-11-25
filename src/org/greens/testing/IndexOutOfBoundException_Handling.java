package org.greens.testing;

import java.util.ArrayList;
import java.util.List;

public class IndexOutOfBoundException_Handling {
  
	public static void main(String[] args) {
		
	     	List<Object> z = new ArrayList<Object>();
	     	
	     	z.add(1);
	     	z.add('@');
	     	z.add(null);
	     	z.add("word");
	     	z.add(true);
	     	
	     	System.out.println(z);
	     	
	     	int size = z.size();
	     	System.out.println(size);
	     	
	     	int index = size - 1;
	     	System.out.println("Index value = " + index);
	     	
	     	try {
	     	 Object object = z.get(6);
				System.out.println(object);
			} catch (IndexOutOfBoundsException e) {
				//e.printStackTrace();
				System.out.println("IndexOutOfBoundsException Handled");
			} 
	     	
	     	
	}
}