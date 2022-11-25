package org.greens.testing;

public class ArrayIndex {
	
	public static void main(String[] args) {
		char a[] = new char[4];
		
			try {
				a[0] = '!';
				a[1] = '@';
				a[2] = '#';
				a[3] = '$';
				a[4] = '%';
				
System.out.println(a);
			} catch (ArrayIndexOutOfBoundsException e) {
//				e.printStackTrace();
				System.out.println("Handled");
			}
	
	}

}
