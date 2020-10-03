package com.noida.learning.ds.hackerrank;

public class DuplicateItem {
	/**
	 * It's a gem of a solution to find a missing number from 1 to n
	 * it uses the negative mark to find the number which is occurred
	 * twice in the array.
	 * @param arr
	 * @return duplicate element if not found 0
	 */
	public static int checkIfContainsDuplicate(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[Math.abs(arr[i])-1]>=0){
				arr[Math.abs(arr[i])-1]=-arr[Math.abs(arr[i])-1];
			}
			else{
				return Math.abs(arr[i]);
			}
		}
		return 0;
	}

	public static void main(String[] args) {
	  int value =	checkIfContainsDuplicate(new int[] { 3, 4, 2, 1, 4 });
			System.out.println(""+value);

	}
}
