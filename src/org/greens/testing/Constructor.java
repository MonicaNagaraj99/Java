package org.greens.testing;

public class Constructor {
	
	int a;
	public Constructor() {
        a = 15;
        String s;
        s= "Default Constructor";
        System.out.println(s);
        System.out.println(a);     
	}
	
	public Constructor(String c ,int b) {
		System.out.println(c);
        System.out.println(b);      
	}
	
	public static void main(String[] args) {
		Constructor obj = new Constructor();
		Constructor object = new Constructor("Paramaterized Constructor",20);
	}	

}

// constructor name same as class name so imp code can be written in it so user no need to call it explicity it execute automatically by creating object
