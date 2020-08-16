package com.noida.learning.ds.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author amar
 *
 */
public class BinarySearch {

	/**
	 * 
	 * Method to perform search operation on array 
	 * Takes logn time to search an
	 * element
	 * 
	 * @param arr
	 * @param num
	 * @return
	 */
	static int bsearch(int arr[], int num) {

		int low, high, mid;
		high = arr.length;
		low = 0;
		while (low <= high) {
			mid = (low + high) / 2;

			if (arr[mid] == num) {
				return mid;
			} else if (arr[mid] > high) {
				low = mid;
			} else {
				low = high;
			}
			return -1;
		}

	  return 0;
	}

	public static void main(String args[]) {
		int num;
		int element;
		int index;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of elements that you want to print");

		num = scan.nextInt();

		int arr[] = new int[num];

		System.out.println("Please enter the elements in the array");
		for (int i = 0; i < num; i++) {
			arr[i] = scan.nextInt();
		}

		Arrays.sort(arr);

		System.out.println("After Sorting the elements are : ");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
			System.out.print("\t");
		}

		System.out.println();

		System.out.println("Enter the element you want to search");

		element = scan.nextInt();

		index = bsearch(arr, element);

		if (index != -1) {
			++index;
			System.out.println("The element is found at " +index);
		}

		else {
			System.out.println("Element not found in the array");
		}

		scan.close();
	}
}
