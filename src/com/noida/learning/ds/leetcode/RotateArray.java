package com.noida.learning.ds.leetcode;

import com.noida.learning.LearningPrinter;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArray {

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }

    public static void rotate(int arr[], int k) {

        if (arr.length == 0) {

        }
         k=k%arr.length;
         reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        LearningPrinter.print(arr);
 //       arr=reverseArray(arr,0,k);
   //     arr= reverseArray(arr,k,arr.length);




    }

    public static void main(String[] args) {

        /*
          Input [1,2,3,4,5,6,7]
          Output [5,6,7,1,2,3,4]

          Input : [-1,-100,3,99]
          Output: [3,99,-1,-100]
         */

        rotate(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 3);

    }
}
