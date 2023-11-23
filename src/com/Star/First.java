package com.Star;

public class First {
	public static void main(String[] args) {

		for (int line = 1; line <= 4; line++) {
			
			//add below spaces for mirror image

			//for (int space = 3; space >= line; space--){
				//System.out.print(" ");
			//}
			for (int ast = 1; ast <= line; ast++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
