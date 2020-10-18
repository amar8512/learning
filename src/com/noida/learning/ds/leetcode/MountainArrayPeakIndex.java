package com.noida.learning.ds.leetcode;

public class MountainArrayPeakIndex {

    public static int findPeakIndexInMountainArray(int arr[]) {
        if (arr.length < 3) {
            return -1;
        }
        int index = -1;
        int n = arr.length;
        boolean arrayLeft[] = new boolean[n];
        arrayLeft[0] = false;
        for (int i = 1; i <= n - 1; i++) {
            if (arr[i] > arr[i - 1]) {
                arrayLeft[i] = true;
            } else {
                arrayLeft[i] = false;
            }
        }
        boolean arrayRight[] = new boolean[arr.length];
        arrayRight[arr.length - 1] = false;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                arrayRight[i] = true;
            } else {
                arrayRight[i] = false;
            }
        }

        for (int i = 1; i < arrayLeft.length; i++) {
            if (arrayLeft[i] == true && arrayRight[i] == true) {
                return i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        //int arr[] = new int[] { 0, 1, 0 };
        int arr[] = new int[] { 24,69,100,99,79,78,67,36,26,19 };
        System.out.println(findPeakIndexInMountainArray(arr));
    }
}
