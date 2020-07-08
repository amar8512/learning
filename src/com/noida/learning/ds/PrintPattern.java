package com.noida.learning.ds;

import java.util.HashMap;
import java.util.Scanner;

public class PrintPattern {
	static int[] icecreamParlor(int m, int[] arr) {
		int arr1[]=arr;
      return arr;
	}

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
		HashMap<Integer,Integer> keyValuePair = new HashMap<>();
		keyValuePair.put(0,1);
		keyValuePair.put(1,2);
		//keyValuePair.
	}
}
