package com.noida.learning.ds.leetcode.twopointer;

import com.noida.learning.java.Utilities;

public class DutchNFlagTwoPointer {
    public static void swap(int index1,int index2,int arr[]){
        int temp=arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void dutchNationalFlag(int arr[]){
       int firstPointer=0;int counter=0;int secondPointer=arr.length-1;
       for(counter=0;counter<=secondPointer;){
           if(arr[counter] == 0){
               swap(counter,firstPointer,arr);
               counter++;
               ++firstPointer;
           }
           else if(arr[counter] ==1){
               ++counter;
           }
           else{
               swap(counter,secondPointer,arr);
               --secondPointer;
           }
       }
       Utilities.print(arr);
    }

    public static void main(String[] args) {
      int arr[] = new int[]{2,0,2,1,1,0};

      dutchNationalFlag(arr);
    }
}
