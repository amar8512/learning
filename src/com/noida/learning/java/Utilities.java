package com.noida.learning.java;

public final class Utilities {
    private Utilities(){
    }

    public static void swapIntegers(int num1,int num2){
        int temp;
        temp = num1;
        num1=num2;
        num2=temp;
    }
    public static void print(int arr[]){
        System.out.println();
       for(int i=0;i<arr.length;i++){
           System.out.print("\t"+arr[i]);
       }
    }
}
