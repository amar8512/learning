package com.noida.learning.ds.hackerrank;

import java.util.Arrays;

public class ArrayManipulationHR {
    static long arrayManipulation(int n, int[][] queries) {
        int arr[] = new int[n];
        //Arrays.fill(arr,0);
        int count[] = new int[n];
        int rowSize = queries.length;
        long max = (long)Integer.MIN_VALUE;
        for(int i=0;i<rowSize;i++){
            //Arrays.fill(arr,queries[i][0]-1,queries[i][1],queries[i][2]);


        }
        for(int i=0;i<n;i++){
            max = Math.max(max,arr[i]);
        }
        return max;

    }

    public static void main(String[] args) {
        int n=5;
        int arr[][] = new int[][]{
                {1,2,100},
                {2,5,100},
                {3,4,100}
        };

        System.out.println(""+arrayManipulation(n,arr));
    }
}
