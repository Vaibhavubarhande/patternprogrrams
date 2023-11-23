package com.Numbers;

public class NumPyramid {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			for (int space = 3; space >= i; space--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}
}
