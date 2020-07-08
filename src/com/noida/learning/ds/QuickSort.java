package com.noida.learning.ds;

import com.noida.learning.java.Utilities;

public class QuickSort {
    public static void swapArray(int arr[] ,int index1 ,int index2){
       int temp= arr[index1];
       arr[index1] = arr[index2];
       arr[index2] = temp;
    }

    public static void quickSort(int low,int high,int arr[]) {
        if (low < high) {
            int pi = partition(low, high, arr);
            quickSort(low, pi-1, arr);
            quickSort(pi+1, high, arr);
        }
    }

    public static int partition(int low,int high,int arr[]){
     int pivot = arr[low];
     int i =low+1;
     for(int j=low+1;j<arr.length;j++){
         if(arr[j]<pivot){
             swapArray(arr,j,i);
             i++;
         }
     }
     swapArray(arr,low,--i);
     return i;
    }

    public static int[] sort(int arr[]){
       quickSort(0,arr.length-1,arr);
       return arr;
    }

    public static void main(String[] args) {
      int arr[] = {9,2,0,11,12,3,7,-1};
      arr=sort(arr);
      Utilities.print(arr);
    }
}
