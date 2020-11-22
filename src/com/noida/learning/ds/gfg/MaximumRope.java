package com.noida.learning.ds.gfg;

import java.util.PriorityQueue;

public class MaximumRope {

    public static int findMinimumCost(int arr[]) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        int cost = 0;
        for (int i = 0; i < arr.length; i++) {
            priorityQueue.add(arr[i]);
        }
        int smallest;
        int secondSmallest;
        while (priorityQueue.size()>1) {
           smallest = priorityQueue.poll();
           secondSmallest = priorityQueue.poll();
           cost=cost+secondSmallest+smallest;
           priorityQueue.add(secondSmallest+smallest);
        }
        return cost;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 8, 4, 6, 12 };
        int cost =findMinimumCost(arr);
        System.out.println(cost);
    }
}
