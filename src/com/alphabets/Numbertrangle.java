package com.alphabets;

public class Numbertrangle {
	
	public static void main(String[] args) {

		int i = 97;

		for (int line = 1; line <= 4; line++) {
			for (int space = 3; space >= line; space--) {
				System.out.print(" ");
			}
			for (int alpha = 0; alpha < line; alpha++) {

				if (line == 3 && alpha == 1) {
					System.out.print("1 ");
				} else {
					if (line == 4 && alpha == 1) {
						System.out.print("2 ");
					} else {
						if (line == 4 && alpha == 2) {
							System.out.print("3 ");
						} else {
							System.out.print((char) (i++) + " ");
						}
					}

				}
			}
			System.out.println();
		}
	}

}
