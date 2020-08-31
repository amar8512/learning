package com.noida.learning.ds.leetcode;

import com.noida.learning.ds.QuickSort;

public class CyclicSort {

   public  static int[] cyclicSort(int arr[]){
   	if(arr==null || arr.length==1){
   		return arr;
    }
   	for(int i=0;i<arr.length;){
   		while ((arr[i] -1)!=i){
		    QuickSort.swapArray(arr,arr[i]-1,i);
	    }
   		i++;
    }
   		return  arr;
   }
	public static void main(String[] args) {
        int arr1[] = new int[]{3, 1, 5, 4, 2};
      arr1=  cyclicSort(arr1);
	}
}
