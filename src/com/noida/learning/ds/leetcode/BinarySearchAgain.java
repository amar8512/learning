package com.noida.learning.ds.leetcode;

public class BinarySearchAgain {
    public static int binRecursiveSearch(int arr[],int key,int low,int high){
        while(low<high){

        }
   return 0;
    }
    public static int binSearch(int arr[], int key){
        return binRecursiveSearch(arr,key,0,arr.length-1);
    }
    public static void main(String []args){
        int[] arr = {1, 10, 20, 47, 59, 63, 75, 88, 99, 107, 120, 133, 155, 162, 176, 188, 199, 200, 210, 222};
        int[] inputs = {10, 49, 99, 110, 176};

        for (int i = 0; i < inputs.length; i++) {
            System.out.println("binSearch(arr, " + inputs[i]+ ") = " +  binSearch(arr, inputs[i]));
        }
    }
}
