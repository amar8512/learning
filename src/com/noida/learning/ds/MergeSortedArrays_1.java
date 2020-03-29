package com.noida.learning.ds;

public class MergeSortedArrays_1 {

   public static void printArray(int arr[]){
       for(int i=0;i<arr.length;i++){
           System.out.print("\t"+arr[i]);
       }
   }
   public static  int[] mergeSortedArrays(int arr1[],int arr2[]){
       if (arr1 == null || arr2 == null){
           return new int[]{0,0};
       }
       int mergedArray[] = new int[arr1.length + arr2.length];
       int i=0,j=0,k=0;
       while(i<arr1.length && j<arr2.length){
           if(arr1[i]<arr2[j]){
               mergedArray[k++] = arr1[i++];
           }
           else {
               mergedArray[k++] = arr2[j++];
           }
       }
       while(i<arr1.length){
           mergedArray[k++] = arr1[i++];
       }
       while (j<arr2.length){
           mergedArray[k++] = arr2[j++];
       }
     return mergedArray;
   }

    public static void main(String[] args) {
        int arr1[] = {1,3,4,5};
        int arr2[] = {2,4,6,8};

        int arr3[] = mergeSortedArrays(arr1,arr2);
        printArray(arr3);
    }
}
