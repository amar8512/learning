package com.noida.learning.ds.leetcode.slidingwindow;

import java.util.HashMap;

public class SubArrayKIntegers {

	public static int subArraysWithKDistinct(int[] A, int K) {
		HashMap<Integer,Integer> hm = new HashMap();
		int windowStart=0,windowEnd=0;int distinctCount=0;
		while (windowEnd<A.length){
          if(!hm.containsKey(A[windowEnd])&&hm.size()<=K){
          	hm.put(A[windowEnd],hm.getOrDefault(A[windowEnd],0)+1);
          	windowEnd++;
          	++distinctCount;
          }
          else{
           hm.remove(A[windowStart]);
           ++windowStart;
          }

		}

		return distinctCount;
	}
	public static void main(String[] args) {
		int arr[] = new int[]{1,2,3,1,2};
		System.out.println(subArraysWithKDistinct(arr,2));
 	}
}
