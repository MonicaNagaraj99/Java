package org.greens.testing;

public final class FinalVariable {

	final char i = '!';
	
	private void method1() {
		char t = '*';
		t = 't';
		final char j = '#';

		System.out.println(t);
		System.out.println(j);
	}

	public static void main(String[] args) {
		FinalVariable var = new FinalVariable();
		System.out.println(var.i);
		var.method1();
		
	}
}
