package com.alphabets;

public class Alphapyramid {

	public static void main(String[] args) {
		int x = 97;
		
		for(int i = 1; i<=4;i++) {
			
			for(int space=4; space>i; space--) {
				System.out.print(" ");
			}
			
			for(int alpha =0; alpha<i;alpha++) {
				System.out.print((char) (x+alpha)+ " ");
			}
			
			System.out.println();
		}
	}
}
