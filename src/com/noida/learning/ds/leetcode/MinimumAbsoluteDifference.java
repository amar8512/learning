package com.noida.learning.ds.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
	public static  List<List<Integer>> minimumAbsDifference(int[] arr) {
		List<List<Integer>> ll = new ArrayList<List<Integer>>();
		if(arr==null || arr.length==1){
			return ll;
		}
		Arrays.sort(arr);
		int min = Integer.MAX_VALUE;
		for(int i=1;i<arr.length;i++){
			if(arr[i]-arr[i-1]<min){
				ll.clear();
				min = arr[i] - arr[i-1];
				ll.add(Arrays.asList(arr[i-1],arr[i]));
			}
			else if(arr[i]-arr[i-1]==min){
				ll.add(Arrays.asList(arr[i-1],arr[i]));
			}
		}
		return ll;
	}
	public static void main(String[] args) {
           List<List<Integer>> ll = minimumAbsDifference(new int[]{3,8,-10,23,19,-4,-14,27});
	}
}
