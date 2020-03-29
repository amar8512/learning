package com.noida.learning.ds;

public class CountEvenDividers {

    public static int findEvenDivisors(int num){
        int temp=num;
        int count=0;
        int digit;
        if(num==0 || num==1){
           return 1;
        }
        while(temp!=0){
            digit = temp%10;
            if(num%digit==0){
             ++count;
            }
            temp=temp/10;
        }

        return count;
    }
    public static void main(String[] args) {
        int num=0;
        System.out.println("The number of even dividors for number "+num+" is "+findEvenDivisors(num));
    }
}
