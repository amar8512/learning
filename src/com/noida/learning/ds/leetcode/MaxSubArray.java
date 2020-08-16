package com.noida.learning.ds.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class MaxSubArray {
    public static void findMaxInSubArray(int arr[],int k){
        Deque<Integer> maxElments = new LinkedList<Integer>();
        int i;
        for(i=0;i<k;i++){
            while(!maxElments.isEmpty() && arr[i]>=arr[maxElments.peekLast()]){
                       maxElments.removeLast();
            }
            maxElments.addLast(i);
        }
        for(;i<arr.length;i++){
            System.out.print(" "+arr[maxElments.peekFirst()]);
            while(!maxElments.isEmpty()&&maxElments.peekFirst()<i+1-k){
                maxElments.removeFirst();
            }
            while(!maxElments.isEmpty() && arr[i]>=arr[maxElments.peekLast()]){
                maxElments.removeLast();
            }
            maxElments.addLast(i);
        }
        System.out.print(" "+arr[maxElments.peekFirst()]);
    //   return null;
    }
    public static void main(String[] args) {
       int arr[] = new int[]{9,6,11,8,10,5,4,13,93,14};
       int k=4;
        findMaxInSubArray(arr,k);
    }
}
