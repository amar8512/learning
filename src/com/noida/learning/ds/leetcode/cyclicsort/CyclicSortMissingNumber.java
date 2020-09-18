package com.noida.learning.ds.leetcode.cyclicsort;

import com.noida.learning.ds.QuickSort;

public class CyclicSortMissingNumber {
	public static void swapArray(int arr[] ,int index1 ,int index2){
		int temp= arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	public  static int cyclicSortAndFindMissingNUmber(int arr[]){
		if(arr==null || arr.length==1){
			return -1;
		}
		for(int i=0;i<arr.length;){
			while (arr[i]<arr.length && arr[i]!=i){
				QuickSort.swapArray(arr,arr[i],i);
			}
			i++;
		}
       for(int i=0;i<arr.length;i++){
       	if(arr[i]!=i){
       		return i;
        }
       }

		return  arr.length;
	}

	public static void main(String[] args) {
		int arr[] = new int[]{9,6,4,2,3,5,7,0,1};
		int misingNumber = cyclicSortAndFindMissingNUmber(arr);
		System.out.println(""+misingNumber);
	}
}
