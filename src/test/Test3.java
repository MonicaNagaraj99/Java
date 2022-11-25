package test;


import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.List;


public class Test3 {
 
	public static void main(String[] args){
		Set<Object> a = new LinkedHashSet<Object>();

		a.add(4);
		a.add('!');
		a.add("d");

		Set<Object> z = new LinkedHashSet<Object>();

		z.add(7);
		z.add('*');

		System.out.println(a);
		System.out.println(z);

		int b = a.size();
		System.out.println(a);

		Boolean c = a.contains(4);
		System.out.println(a);

		Boolean d = a.equals(b);
		System.out.println(d);

		Boolean e = a.isEmpty();
		System.out.println(e);

		a.remove(4);
		System.out.println(a);

		a.addAll(z);
		System.out.println(a);
		
		Object y[] = a.toArray();
		for(Object i : y){
		System.out.println(i);
		}

		String v = a.toString();
		System.out.println(v);
}
}
