package org.greens.testing;

public class String_Types {
 
  public static void main(String[] args) {
	
	  StringBuilder a = new StringBuilder("Mutable");
	  System.out.println(a);
	  int hashCode_A = a.hashCode();
	  System.out.println(hashCode_A);
	  
	  StringBuilder b = new StringBuilder("Mutable");
	  System.out.println(b);
	  int hashCode_B = b.hashCode();
	  System.out.println(hashCode_B);
	  
	  StringBuilder append = a.append(b);
	  System.out.println(append);
	  int hashCode_C = append.hashCode();
	  System.out.println(hashCode_C);
}
}
