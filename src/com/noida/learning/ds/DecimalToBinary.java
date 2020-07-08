package com.noida.learning.ds;

import java.util.Stack;

public class DecimalToBinary {
    public static String longToBinary(long num){
        if(num ==0){
            return "0";
        }
        if(num ==1){
            return "1";
        }
        Stack<Integer> stackOfCharacters = new Stack();
        String s = "";
        while(num != 0){
            stackOfCharacters.push((int)num%2);
            num =num/2;
        }
        while(!stackOfCharacters.isEmpty()){
          s = s+stackOfCharacters.pop().toString();
        }
        return s;
    }
    public static void main(String[] args) {
       long num =1223;
       String binary=longToBinary(num);
        System.out.println(binary);
    }
}
