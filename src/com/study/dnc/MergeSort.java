package com.study.dnc;

public class MergeSort {

    public static void mergeSort(int arr[],int low,int high){
        if(low<high){
            int mid=(low+high)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }

    }

    public static void printArray(int arr[]){
       for(int i=0;i<arr.length;++i){
           System.out.print("\t "+arr[i]);
       }
    }

    public static void merge(int arr[],int low,int middle ,int high){

        int left=middle-low+1;
        int right= high-middle;

        int leftArr[] = new int[left];
        int rightArr[] = new int[right];

        for(int i=0;i<left;i++){
            leftArr[i]=arr[low+i];
        }

        for(int j=0;j<right;j++){
            rightArr[j]=arr[middle+1+j];
        }

        int i=0,j=0;
        int k=low;

        while(i<left && j<right){
            if(leftArr[i]<arr[k]){
                arr[k] = leftArr[i] ;
                ++i;
            }
            else{
                arr[k] = rightArr[j];
                ++j;
            }
            ++k;
        }

        while(i<left){
            arr[k]=leftArr[i];
            ++i;
            ++k;
        }

        while(j<right){
            arr[k]=rightArr[j];
            ++j;
            ++k;
        }

    }



    public static void main(String[] args) {
        int arr[] = new int[]{-7,5,1,0,9,-1,2,};
        mergeSort(arr,0,arr.length-1);
        printArray(arr);
    }
}
