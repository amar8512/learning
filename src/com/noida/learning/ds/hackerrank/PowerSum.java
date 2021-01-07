package com.noida.learning.ds.hackerrank;

/**
 *   Find the number of ways that a given integer X, can be expressed as the sum of the Nth  powers of unique, natural numbers.
 *
 * For example, if  and , we have to find all combinations of unique squares adding up to . The only solution is 2^2 +3 ^2.
 *
 * Function Description
 *
 * Complete the powerSum function in the editor below. It should return an integer that represents the number of possible combinations.
 *
 * powerSum has the following parameter(s):
 *
 * X: the integer to sum to
 * N: the integer power to raise numbers to
 *
 *
 *
 */

public class PowerSum {

    static int powerSumUtil(int x, int n){
        if(x<0){
            return 0;
        }
        if(Math.pow(x,n)==n){
            return 1;
        }
        if(Math.pow(x,n)>n){
            return 0;
        }
        return powerSumUtil(x--,n) + powerSumUtil(x++,n);

    }

    static int powerSum(int X, int N) {

        return powerSumUtil(X,N);
    }
    public static void main(String[] args) {

    }
}
