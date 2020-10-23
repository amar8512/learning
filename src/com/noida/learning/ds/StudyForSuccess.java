package com.noida.learning.ds;



public class StudyForSuccess {

	static  int findMinSubArray(int k,int arr[]){
		int windowStart=0;
		int windowEnd=0;
        int minSize =Integer.MAX_VALUE;
        int sum =0;
		for(windowEnd=0;windowEnd<arr.length;windowEnd++){
           sum = sum + arr[windowEnd];
           while (sum>=k){
            minSize =Math.min(minSize,windowEnd-windowStart+1);
            sum = sum-arr[windowStart];
           	windowStart++;
		   }
		}
		return minSize;
	}


	public static void main(String args[]){
		int result = StudyForSuccess.findMinSubArray(7, new int[] { 2, 1, 5, 2, 3, 2 });
		System.out.println("Smallest subarray length: " + result);
		result = StudyForSuccess.findMinSubArray(7, new int[] { 2, 1, 5, 2, 8 });
		System.out.println("Smallest subarray length: " + result);
		result = StudyForSuccess.findMinSubArray(8, new int[] { 3, 4, 1, 1, 6 });
		System.out.println("Smallest subarray length: " + result);
		 
	}
}
