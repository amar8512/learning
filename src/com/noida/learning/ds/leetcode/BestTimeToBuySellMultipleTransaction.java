package com.noida.learning.ds.leetcode;

public class BestTimeToBuySellMultipleTransaction {
    static int maxProfit(int[] prices) {
        int maxProfilt = 0;
        int n = prices.length;
        for(int i=1;i<n;i++){
            if(prices[i]>prices[i-1]){
                maxProfilt+=prices[i]-prices[i-1];
            }
        }
        return maxProfilt;
    }

    public static void main(String[] args) {
      maxProfit(new int[]{7,1,5,3,6,4});
    }
}
