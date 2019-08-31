package com.study.dnc;

import java.util.Arrays;

public class CountingInversion {

    public static int countingInversion(int arr[]) {
        int countingInversion = 0;
        int l = 0;
        int r = arr.length - 1;
        countingInversion += mergeSort(arr, l, r);
        return countingInversion;
    }

    public static int mergeSort(int arr[], int low, int high) {
        int countingInversion = 0;
        if (low < high) {
            int mid = (low + high) / 2;
            countingInversion = mergeSort(arr, low, mid);
            countingInversion += mergeSort(arr, mid + 1, high);
            countingInversion += merge(arr, low, mid, high);
        }
        return countingInversion;
    }

    public static int merge(int arr[], int low, int mid, int high) {
        int inverCount = 0;
        int left = mid - low;
        int right = high - (mid + 1);
       // int leftArr[] = new int[left];
       // int rightArr[] = new int[right];
        int leftArr[]  = Arrays.copyOfRange(arr,low,mid+1);
        int rightArr[]=  Arrays.copyOfRange(arr,mid+1,right+1);

        int k = left;
        for (int i = 0; i < left; i++) {
            leftArr[i] = arr[k];
            i++;
            k++;
        }
        k = right;
        for (int i = 0; i < right; i++) {
            rightArr[i] = arr[k];
            i++;
            k++;
        }
        int i = 0;
        int j = 0;
        k = low;
        while (i < left && j < right) {
            if (leftArr[i] < rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
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
        System.out.println("counting inversion for the above array is : "+countingInversion(arr));
    }
}
