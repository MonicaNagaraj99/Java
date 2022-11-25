package org.greens.testing;

public class Wrapper_Class {
	
	public static void main(String[] args) {
		
		boolean a = false ;
		Boolean z = new Boolean(a);
		System.out.println(z);
	   
		char b = '^';
		Character y = new Character(b);
		System.out.println(y);
	
	    byte c = 123;
	    Byte x = new Byte(c);
	    System.out.println(x);
	    
	    short d = 12345;
	    Short w = new Short(d);
	    System.out.println(w);
	
	    int e = 123456789;
	    Integer v = new Integer(e);
	    System.out.println(v);
	  
	    long f = 123456789345l;
	    Long u = new Long(f);
	    System.out.println(u);
	
	    float g = 3.45f;
	    Float t = new Float(g);
	    System.out.println(t);
	    
	    double h = 44.56;
	    Double s = new Double(h);
	    System.out.println(s);
	    
	    // retriveing datatype from object 
	    double i = s;
	    System.out.println(i);
	 
	}
}
