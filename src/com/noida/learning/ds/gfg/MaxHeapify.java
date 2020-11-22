package com.noida.learning.ds.gfg;

import com.noida.learning.LearningPrinter;

public class MaxHeapify {
    public static void maxHeapify(int arr[],int n,int i){
     int left=i*2+1;
     int right=i*2+2;
     int largest = i;

     if(left<n && arr[left]>arr[largest]){
         largest = left;
     }
     if(right<n && arr[right]>arr[largest]){
         largest = right;
     }
     if(largest!=i){
         int temp = arr[i];
         arr[i] = arr[largest];
         arr[largest] = temp
         ;
         maxHeapify(arr,n,largest);
     }
    }
    public static void printHeap(int arr[]){
       LearningPrinter.print(arr);
    }
    public static void main(String[] args) {
         int arr[] = new int[]{12,20,2,13,32,50,88,21,18,91};
        LearningPrinter.print(arr);
         int startIndex = (arr.length/2)-1;
         int n =arr.length;
         for(int j=startIndex;j>=0;j--){
             maxHeapify(arr,n,j);
         }
        printHeap(arr);

    }
}
