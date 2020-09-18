package com.noida.learning.ds.leetcode.cyclicsort;

import java.util.ArrayList;
import java.util.List;

import static com.noida.learning.ds.leetcode.cyclicsort.DuplicateNumber.swapArray;

public class DuplicateNumbers {

	public static List<Integer> findNumbers(int[] nums) {
		if (nums == null) {
			return new ArrayList<>();
		}
		List<Integer> missingNumbers = new ArrayList<>();
		for (int i = 0; i < nums.length; ) {
			if (nums[i] != nums[nums[i] - 1]) {
				swapArray(nums, i, nums[i] - 1);
			} else {
				i++;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != i + 1) {
				missingNumbers.add(nums[i]);
			}
		}
		return missingNumbers;
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 3, 4, 4, 5, 5 };
		List l1 = findNumbers(arr);
		System.out.println(l1.toArray());
	}
}
