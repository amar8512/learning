package com.noida.learning.ds.hackerrank;

import com.noida.learning.LearningPrinter;

public class LeftRotateNaive {
    public static int[] leftRotateArray(int arr[],int d){
        for(int i=1;i<=d;i++){
            int temp = arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = temp;
        }
   return arr;
    }
    public static void main(String[] args) {
        int arr[] = {4,-1,0,2,8};
        int d =3;
        System.out.println("Before rotation: ");
        LearningPrinter.print(arr);
        arr =leftRotateArray(arr,d);
        System.out.println("After rotation");
        LearningPrinter.print(arr);
    }
}
