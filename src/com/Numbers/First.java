package com.Numbers;

public class First {

	public static void main(String[] args) {
		int x = 1;

		for (int line = 1; line <= 4; line++) {
			for (int num = 1; num <= line; num++) {
				System.out.print(x++);
			}
			System.out.println();
		}
	}

}
