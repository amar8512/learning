package com.noida.learning;

public class RecursionDemo {

    public void printRecursively(int arr[],int n){
        if(n==-1){
            return;
        }
        System.out.print("\t "+arr[n]);
        printRecursively(arr,--n);
    }
    public  void print(int arr[]){
        printRecursively(arr, arr.length-1);
    }
    public static void main(String[] args) {
        int arr[]= {0,-9,11,2,77,4};
       RecursionDemo demo = new RecursionDemo();
       demo.print(arr);
    }
}
