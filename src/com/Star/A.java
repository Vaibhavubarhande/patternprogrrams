package com.Star;

public class A {

	public void isPyramid(int lines) {

		for (int line = 1; line <= lines; line++) {

			for (int space = lines; space >= line; space--) {

				System.out.print(" ");
			}
			for (int ast = 1; ast <= line; ast++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
}
