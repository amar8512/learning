package com.company;

public class Powerclass {


    static int raiseToPower(int number, int power)
    {
        int result = number*number;
        return raiseToPower(number,power-1);
    }
    public static void main(String[] args) {
        raiseToPower(3,5);
    }
}
