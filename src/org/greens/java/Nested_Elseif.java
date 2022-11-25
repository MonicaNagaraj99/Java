package org.greens.java;

public class Nested_Elseif {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(" ");
			}
			 for (int k = 1; k <= i; k++) {
				 
				 int h= i;
				 if (h==1)
				System.out.print(" "+" "+"*");
				 if (h==2)
				System.out.print(" "+"*");
				if (h==3)
				System.out.print("*"+" ");
			}
			 System.out.println();
		}
		
	}
}
	


            /* for (int i = 1; i <=4 ; i++) {
			for (int j = 1; j <=4 - i; j++) {
				System.out.print(" "+" ");
			}
			
			for (int k = 1; k <= i; k++) {
				
				int h = i;
				if (h==2) {
					System.out.print("#"+" ");
				}
				else if (h==4) {
					System.out.print("#"+" ");
				}
				else {
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}		
//	}	*/
		
