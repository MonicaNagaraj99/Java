package org.greens.testing;

public class Interrupted_Excption {
  
	public static void main(String[] args) throws InterruptedException  {
		
		System.out.println("First");
		
		Thread.sleep(4000);
		
		System.out.println("Seceond");
	}
}
