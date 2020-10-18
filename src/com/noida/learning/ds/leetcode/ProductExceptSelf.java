package com.noida.learning.ds.leetcode;

import com.noida.learning.LearningPrinter;
import com.noida.learning.ds.PrintPattern;

import java.util.Arrays;

public class ProductExceptSelf {

    public static int[] productExceptSelfNaive(int nums[]) {
        if (nums == null) {
            return null;
        }
        int prefiex[] = new int[nums.length];
        int suffix[] = new int[nums.length];
        prefiex[0] = 1;
        suffix[nums.length - 1] = 1;
        int j = nums.length - 2;
        int i = 1;
        while (j >= 0) {
            suffix[j] = suffix[j + 1] * nums[j + 1];
            j--;
        }
        while (i < nums.length) {
            prefiex[i] = prefiex[i - 1] * nums[i - 1];
            i++;
        }
        i = 0;
        for (; i < nums.length; i++) {
            nums[i] = prefiex[i] * suffix[i];
        }

        return nums;
    }

    public static int[] productExceptSelfOptimized(int nums[]) {
        if (nums == null) {
            return null;
        }
        int product[] = new int[nums.length];
        int temp = 1;
        Arrays.fill(product, 1);
        for (int i = 0; i < nums.length; i++) {
            product[i] = temp;
            temp *= nums[i];
        }
        LearningPrinter.print(product);
        temp = 1;
        // LearningPrinter.print(product);
        /*
        Initial Array
        3 2 6 4 9
        1 3 6 36 144
        432 648 216 324 144
         */
        for (int i = nums.length - 1; i >= 0; i--) {
            product[i] *= temp;
            temp *= nums[i];
        }
        return product;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 3, 2, 6, 4, 9 };
        //arr= productExceptSelfNaive(arr);
        System.out.println("Initial Array");
        LearningPrinter.print(arr);
        arr = productExceptSelfOptimized(arr);
        LearningPrinter.print(arr);
    }

    public int[] productExceptSelf(int[] nums) {
        if(nums == null) return null;

        int n = nums.length;
        int prod[] = new int[nums.length];
        int temp=1;
        for(int i=0;i<n;i++){
            prod[i]=temp;
            temp = temp * nums[i];
        }
        temp = 1;
        for(int i=n-1;i>=0;i--){
            prod[i] = prod[i] * temp;
            temp = temp * nums[i];
        }
        return nums;
    }
}
