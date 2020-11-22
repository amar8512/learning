package com.noida.learning.ds.leetcode;

public class KadaneAlgorithm {
    public int maxSubArray(int[] nums) {
        int maxGlobal= nums[0];
        int currentMax = nums[0];
        if(nums.length==1){
            return  nums[0];
        }
        for(int i=1;i<nums.length;i++){
            currentMax = Math.max(nums[i],currentMax+nums[i]);
            maxGlobal = Math.max(currentMax,maxGlobal);
        }
        return maxGlobal;
    }
    public static void main(String[] args) {
        KadaneAlgorithm obj = new KadaneAlgorithm();

       // System.out.println(obj.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(obj.maxSubArray(new int[]{-2147483647}));
    }
}
