package com.noida.learning.ds.leetcode.slidingwindow;

public class MaximumConsecutiveOne {

    public static int maximumConsecutiveOne(int arr[],int k){
        int maxlength=0;
        int currentMaxOne=0;
        int n = arr.length;
        int leftPointer =0;
        int rightPointer=0;
        for( rightPointer=0;rightPointer<n;rightPointer++){
            if(arr[rightPointer]==1){
             ++currentMaxOne;
            }
            if(rightPointer-leftPointer+1-currentMaxOne>k){
                if(arr[leftPointer]==1){
                    --currentMaxOne;
                }
                ++leftPointer;
            }
          //0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1
           maxlength= Math.max(rightPointer-leftPointer+1,maxlength);
        }

        return maxlength;
    }
    public static void main(String[] args) {
        System.out.println(maximumConsecutiveOne(new int[] { 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1 }, 2));
        System.out.println(maximumConsecutiveOne(new int[] { 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1 }, 3));
    }
}
