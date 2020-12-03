package com.noida.learning.ds.leetcode;

/**
 * BestTimeTo sell leetcode question for stacks stored in an array
 * First of all we iterate through the array and find the smalest element
 * and the element which is the largest element than our minimum and return there
 * difference which is the profit earned .
 * The time complexity of the solution is O(n).
 * Space complexity of the solution is O(1).
 *
 */
public class BestTimeToBuySell {

    public static int  bestTimeToBuySell(int arr[],int n){
          int small=Integer.MAX_VALUE;
          int large =0;

          for(int i=0;i<arr.length;i++){
              if(arr[i]<small){
                  small = arr[i];
              }
              else {
                  large = Math.max(arr[i]-small,large);
              }
          }
          return  large;
    }
    public static void main(String[] args) {
       //[7,1,5,3,6,4]
        int arr[] = new int[] {7,1,5,3,6,4};
        System.out.println(bestTimeToBuySell(arr,6));
    }
}
