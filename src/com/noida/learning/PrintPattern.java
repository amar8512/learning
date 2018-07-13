package com.noida.learning;

import java.util.Scanner;

public class PrintPattern {
	public static void main(String args[]) {
		int lines;

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter the number of lines you want to print:\t");
		lines = scn.nextInt();

		for (int i = lines; i >= 1; i--) {
			for (int j = lines; j >= i; j--) {
				System.out.print(" " + i);
			}
			System.out.println();
		}
	}
}
