package com.noida.learning.ds.leetcode;

import com.noida.learning.java.Utilities;

class DutchFlag {

    public static void sort(int[] arr) {
        int count[] = new int[3];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                ++count[0];
            }
            if(arr[i]==1){
                ++count[1];
            }
            if(arr[i]==2){
                ++count[2];
            }
        }

        int i=0;
        while(count[0]>0){
            arr[i++] =0;
            --count[0];
        }
        while(count[1]>0){
            arr[i++] =1;
            --count[1];
        }
        while(count[2]>0){
            arr[i++] =2;
            --count[2];
        }

        Utilities.print(arr);
    }

    public static void main(String[] args) {
        int arr[] = new int[]{0,1,0,1,2,2,1,0,0,1};
        sort(arr);
    }
}

