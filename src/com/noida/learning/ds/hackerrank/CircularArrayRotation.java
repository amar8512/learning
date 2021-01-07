package com.noida.learning.ds.hackerrank;

import com.noida.learning.LearningPrinter;

public class CircularArrayRotation {
    static int[]reverse(int arr[] , int start,int end){
        while(start<end){
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        k=k%a.length;
        reverse(a,0,a.length-1);
        reverse(a,0,k-1);
        reverse(a,k,a.length-1);

        for(int i=0;i<queries.length;i++){
            queries[i] = a[queries[i]];
        }

        return queries;

    }
        public static void main(String[] args) {
              int arr[] = new int[]{1,2,3};
              int queries[] = new int[]{0,1,2};
              int k =2;
             queries= circularArrayRotation(arr,k,queries);
            LearningPrinter.print(queries);
         }
}
