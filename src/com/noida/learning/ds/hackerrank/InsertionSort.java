package com.noida.learning.ds.hackerrank;

public class InsertionSort {

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void sortArray(int arr[]){
        int temp=0;
        int j=0;
        for(int i=1;i<arr.length;i++){
            temp= arr[i];
            j=i;
            //temp = arr[j];
            while (j>0 && temp<arr[j-1]){
                  arr[j]=arr[j-1];
                  j--;
            }
            arr[j] = temp;
            print(arr);
        }
    }
    public static void main(String[] args) {
              int arr[] = new int[]{1,4,3,5,6,2};
               sortArray(arr);
    }


}
