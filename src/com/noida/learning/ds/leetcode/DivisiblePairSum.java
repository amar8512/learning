package com.noida.learning.ds.leetcode;

public class DivisiblePairSum {
    public static int countKDivPairs(int A[], int n, int K)
    {
        // Create a frequency array to count 
        // occurrences of all remainders when 
        // divided by K 
        int freq[] = new int[K];

        // Count occurrences of all remainders 
        for (int i = 0; i < n; i++)
            ++freq[A[i] % K];

        // If both pairs are divisible by 'K' 
        int sum = freq[0] * (freq[0] - 1) / 2;

        // count for all i and (k-i) 
        // freq pairs 
        for (int i = 1; i <= K / 2 && i != (K - i); i++)
            sum += freq[i] * freq[K - i];
        // If K is even 
        if (K % 2 == 0)
            sum += (freq[K / 2] * (freq[K / 2] - 1) / 2);
        return sum;
    }
    public static void main(String[] args)
    {
        int A[] = { 2, 2, 1, 7, 5, 3 };
        int n = 6;
        int K = 4;
        System.out.print(countKDivPairs(A, n, K));
    }
} 