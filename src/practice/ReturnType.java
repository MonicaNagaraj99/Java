package practice;

public class ReturnType {
  
	public void method1() {
		System.out.println("1");
	}
	public int method2() {
		System.out.println("2");
		return 5;
	}
	private String method3(String i) {
		System.out.println(i);
		return "Return";
	}
	public static void main(String[] args) {
	  ReturnType a = new ReturnType();
	  a.method1();
	  int b = a.method2();
	  System.out.println(b);
	  String c = a.method3("String");
	  System.out.println(c);
	}
}
