package com.noida.learning.ds;

public class BinaryManipulation {

    static long flippingBits(long n) {
        int MAX = 0b1111_1111_1111_1111_1111_1111_1111_1111;
        return Long.valueOf(Integer.toBinaryString(MAX^(int)n),2);

    }


    public static void main(String[] args) {
        int MAX = 0b1111_1111_1111_1111_1111_1111_1111_1111;
        //int MAX =0b11_111_111_111_111_111_111_111_111_111_111;
        int n=9;
        System.out.println(Long.valueOf(Integer.toBinaryString(MAX),2));
       System.out.println(Long.valueOf(Integer.toBinaryString(MAX^n),2));

    }
}
