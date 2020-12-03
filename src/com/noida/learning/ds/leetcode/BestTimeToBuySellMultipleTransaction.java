package com.noida.learning.ds.leetcode;

/**
 *  This is the variation of the question to find the best time to sell a stock
 *  However here is a small twist we have to find the total profit earned by doing multiple transations
 *  from day 1 to day n.
 *  The basic logic is find all those elements which are greater than there previous element and
 *  store the result in max Profit variable.
 *  The solution here uses greedy programming approach maxPeek Valley approach.
 */
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
