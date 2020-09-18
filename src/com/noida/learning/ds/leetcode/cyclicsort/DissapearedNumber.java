package com.noida.learning.ds.leetcode.cyclicsort;

import com.noida.learning.ds.QuickSort;
import com.noida.learning.java.Utilities;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DissapearedNumber {

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		if (nums == null) {
			return new ArrayList<>();
		}
		List<Integer> listOfDissapearedIntegers = new ArrayList<>();
		for(int i=0;i<nums.length;){
			if(nums[i]!= nums[nums[i]-1]){
               QuickSort.swapArray(nums,i,nums[i]-1);
			}
			else {
				i++;
			}
		}
		for(int i=0;i<nums.length;i++){
			if(nums[i] != i+1){
				listOfDissapearedIntegers.add(i+1);
			}
		}
		return listOfDissapearedIntegers;
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 4, 3, 2, 7, 8, 2, 3, 1 };
		System.out.println(findDisappearedNumbers(arr));
	}
}
