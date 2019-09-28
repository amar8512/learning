package com.company;

import java.util.Arrays;

public class CountingInversion {



    public static int mergeSort(int arr[], int low, int high) {
        int countingInversion = 0;
        if (low < high) {
            int mid = (low + high) / 2;
            countingInversion += mergeSort(arr, low, mid);
            countingInversion += mergeSort(arr, mid + 1, high);
            countingInversion += merge(arr, low, mid, high);
        }
        return countingInversion;
    }

    public static int merge(int arr[], int low, int mid, int high) {

        int left = mid - low;
        int right = high - (mid + 1);
         int leftArr[] = new int[left];
         int rightArr[] = new int[right];
        //int leftArr[]  = Arrays.copyOfRange(arr,low,mid+1);
       // int rightArr[]=  Arrays.copyOfRange(arr,mid+1,right+1);

        int k = left;
        for (int i = 0; i < left; i++) {
            leftArr[i++] = arr[k++];
        }
        for (int i = 0; i < right; i++) {
            rightArr[i++] = arr[k++];
        }
        int i = 0;
        int j = 0;
        k = low;
        int inverCount = 0;
        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
                inverCount+=(mid+1)-(low+i);
            }
        }
        while(i<left){
            arr[k++]=leftArr[i++];
        }
        while(j<right){
            arr[k++]=rightArr[j++];
        }

        return inverCount;

    }

    public static void main(String[] args) {
        int arr[] = new int[]{7,2,9,1,8,0};
        System.out.println("counting inversion for the above array is : "+mergeSort(arr,0,arr.length-1));
    }

}