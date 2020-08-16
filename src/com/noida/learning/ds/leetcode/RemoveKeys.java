package com.noida.learning.ds.leetcode;

public class RemoveKeys {
	public static void main(String[] args) {
		int arr[] = new int[]{0,1,2,2,3,0,4,2};
		int count = removeElement(arr,2);
		System.out.println(count);
	}
	public static int removeElement(int[] arr, int key) {
		int keyCounter=0;
		int i=0;
		int temp=0;//{0,1,2,2,3,0,4,2};
		while(i<arr.length && keyCounter<arr.length){
			if(arr[i]!=key) {
				temp = arr[i];
				arr[i] = arr[keyCounter];
				arr[keyCounter] = temp;
				++keyCounter;
			}
			i++;
		}
		return keyCounter;
	}
}
