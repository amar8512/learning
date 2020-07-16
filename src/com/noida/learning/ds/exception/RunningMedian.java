package com.noida.learning.ds.exception;


import java.util.PriorityQueue;

public class RunningMedian {

    public static void add(PriorityQueue<Integer> lowers,
            PriorityQueue<Integer> highers, int number) {
        if(lowers.size()==0 || number< lowers.peek()) {
            lowers.add(number);
        }
        else {
            highers.add(number);
        }
    }
    public static void balance(PriorityQueue<Integer> lowers,
            PriorityQueue<Integer> highers){
        PriorityQueue<Integer> bigger = lowers.size()>highers.size()?lowers:highers;
        PriorityQueue<Integer> smaller = lowers.size()>highers.size()?highers:lowers;
        if(bigger.size()-smaller.size()>=2){
            smaller.add(bigger.poll());
        }
    }
    public static double getMedian(PriorityQueue<Integer> lowers,
            PriorityQueue<Integer> highers){
        PriorityQueue<Integer> bigger = lowers.size()>highers.size()?lowers:highers;
        PriorityQueue<Integer> smaller = lowers.size()>highers.size()?highers:lowers;
        if(bigger.size() == smaller.size()){
             return ((double) bigger.peek()+smaller.peek())/2;
        }
        else {
            return bigger.peek();
        }
    }
    public static double[] findMedians(int arr[]) {
        PriorityQueue<Integer> lowers = new PriorityQueue<>(
                (Integer o1, Integer o2) -> {
                    return -1 * o1.compareTo(o2);
                });

        PriorityQueue<Integer> highers = new PriorityQueue<Integer>();
        double[] medians = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
           add(lowers,highers,arr[i]);
           balance(lowers,highers);
           medians[i]=getMedian(lowers,highers);
        }
        return medians;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 55, 50, 22, 15, 82, 7, 90 };
         double[] arr1=findMedians(arr);
       for (int i =0;i<arr1.length;i++){
           System.out.println(arr1[i]);
       }
    }
}
