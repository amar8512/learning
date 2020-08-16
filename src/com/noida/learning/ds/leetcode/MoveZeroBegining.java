package com.noida.learning.ds.leetcode;

import com.noida.learning.java.Utilities;

public class MoveZeroBegining {

    public static int[] moveZeroes(int[] nums) {
        int writerIndex = 0;
        int readerIndex=0;
       while(readerIndex< nums.length) {
           if (nums[readerIndex] != 0) {
               nums[writerIndex] = nums[readerIndex];
               ++writerIndex;
           }
          ++readerIndex;
       }
       while(writerIndex<nums.length){
           nums[writerIndex] =0;
           writerIndex++;
       }
       return  nums;
       }


    public static void main(String[] args) {
        int arr[] = new int[]{0,1,0,3,12};
       arr = moveZeroes(arr);
        Utilities.print(arr);
    }
}
