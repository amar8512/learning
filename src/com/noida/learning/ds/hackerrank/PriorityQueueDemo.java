package com.noida.learning.ds.hackerrank;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PriorityQueueDemo {
    public static PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(

            /*new Comparator<Integer>() {
                @Override public int compare(Integer o1, Integer o2) {
                    return -1*o1.compareTo(o2);
                }
            }*/
            (o1, o2) -> {
              return  -1*o1.compareTo(o2);
            }
            );
    public static  void add(int num){
        priorityQueue.add(num);
        System.out.println(priorityQueue.peek());
    }
    public static  void display(){
        System.out.println(priorityQueue.remove());
    }
    public static void main(String[] args) {
        int arr[] = new int[]{10,12,0,2,-1,22,3,71,1};
        for(int i =0;i<arr.length;i++){
            add(arr[i]);
        }
        Executor executor = Executors.newFixedThreadPool(10);
        //ExecutorService
        System.out.println("poll "+priorityQueue.poll());
        System.out.println("poll "+priorityQueue.poll());
        System.out.println("poll "+priorityQueue.poll());
        System.out.println("peek "+priorityQueue.peek());
        System.out.println("peek "+priorityQueue.peek());
    }

}
