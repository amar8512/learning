package com.noida.learning.ds.hackerrank;

import java.util.Arrays;

public class MinMaxGreedy {
	public static int minMaxGreedySolution(int arr[], int k) {
		if (arr == null) {
			return -1;
		}
		Arrays.sort(arr);
		int startValue, endValue;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i <= (arr.length - k); i++) {
			startValue = arr[i];
			endValue = arr[i + k - 1];
			min=Math.min(min,endValue-startValue);
		}
		return min;
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 100,200,300,350,400,401,402};
		System.out.println(" "+minMaxGreedySolution(arr,3));
		/*
		100
200
300
350
400
401
402
		 */
	}
}
