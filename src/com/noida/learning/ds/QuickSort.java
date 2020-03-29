package com.noida.learning.ds;

import com.noida.learning.java.Utilities;

public class QuickSort {

    public static void quickSort(int low,int high,int arr[]) {
        int pi = 0;
        if (low < high) {
            pi = partition(low, high, arr);
            quickSort(low, pi, arr);
            quickSort(pi, high, arr);
        }
    }

    public static int partition(int low,int high,int arr[]){
     int pivot = arr[0];
     int i =1;
     for(int j=1;j<arr.length;j++){
         if(arr[j]<pivot){
             Utilities.swapIntegers(arr[j],arr[i]);
             i++;
         }
     }
     Utilities.swapIntegers(arr[--i],pivot);
     return --i;
    }

    public static int[] sort(int arr[]){
       quickSort(0,arr.length-1,arr);
       return arr;
    }

    public static void main(String[] args) {

    }
}
