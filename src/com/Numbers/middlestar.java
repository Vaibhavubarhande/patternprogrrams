package com.Numbers;

public class middlestar {
	public static void main(String[] args) {

		for (int line = 1; line <= 4; line++) {
			for (int space = 3; space >= line; space--) {
				System.out.print(" ");
			}
			for (int n = 1; n <= line; n++) {

				if (line == 3 && n == 2) {
					System.out.print("* ");
				} else {
					if (line == 4 && n == 2 || line == 4 && n == 3) {
						System.out.print("* ");

					} else {
						System.out.print(n + " ");
					}
				}
			}
			System.out.println();
		}
	}
}
