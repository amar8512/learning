package com.noida.learning.ds.leetcode;

public class AverageSubArrayProblem {
    public static double[] calculateAverageOfSubArrays(int arr[],int K){
        double result[]= new double[arr.length-K+1];
        int sum=0;
        int resultIndex=0;
        for(int windOWIndex=0;windOWIndex<arr.length;){
           sum=arr[windOWIndex]+sum;
           if(windOWIndex==K){
               int average = sum/K;
               result[resultIndex]=average;
               sum=
               ++resultIndex;
               ++windOWIndex;
           }
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
