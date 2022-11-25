package org.greens.testing;

class Access_Modifiers {
	
	public void green() {
		System.out.println("green-public");
	}
	private void red() {
		System.out.println("red-private");
	}
	void blue() {
		System.out.println("blue-default");
	}
	protected void yellow() {
		System.out.println("yellow-protected");
	}
	public static void main(String[] args) {

		Access_Modifiers g = new Access_Modifiers();
		Access_Modifiers r = new Access_Modifiers();
		Access_Modifiers b = new Access_Modifiers();
		Access_Modifiers y = new Access_Modifiers();

		g.green();
		r.red();
		b.blue();
		y.yellow();
	}
}
