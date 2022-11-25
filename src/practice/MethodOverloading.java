package practice;

public class MethodOverloading {
	
	private void m1(byte a,short b) {
   System.out.println(a);
   System.out.println(b);
	}
	 protected void m3(int c, float d) {
System.out.println(c);
System.out.println(d);
	}
	public static void main(String[] args) {
		 
	  MethodOverloading s = new MethodOverloading();
//	  s.m1(4, 32);
//	  s.m1(56, 67);
	}
}
