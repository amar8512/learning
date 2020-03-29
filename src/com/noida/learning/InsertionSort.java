package com.noida.learning;

public class InsertionSort {


    public static int[] sortArray(int arr[]){
        int x;
        int j;
        for(int i=arr.length-1;i>=0;i--){
        x=arr[i-1];

      }
      return  arr;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{8,0,-1,11,2,3};

        arr = sortArray(arr);
        LearningPrinter.print(arr);

    }
}
