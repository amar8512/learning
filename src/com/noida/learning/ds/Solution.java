package com.noida.learning.ds;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static Stack<Integer> stackOfElements = new Stack();
    public static Scanner scan = new Scanner(System.in);
    public static int maxElement = Integer.MIN_VALUE;
    public static Stack<Integer> maxStack = new Stack();
    public static List<Integer> resultLists = new ArrayList<Integer>();

    public static void main(String[] args) {
        int t = scan.nextInt();
        int times=0;
        int selection;
        while(times<t){
            selection = scan.nextInt();
            switch(selection){
            case 1:
                Integer input=scan.nextInt();
                if(input>maxElement){
                    maxStack.push(input);
                    maxElement = input;
                }
                stackOfElements.push(input);
                break;
            case 2:
                if(!stackOfElements.isEmpty() && !maxStack.isEmpty()
                        && maxElement == stackOfElements.peek()){
                    maxStack.pop();
                    //maxElement = stackOfElements.peek();
                    if(!maxStack.isEmpty()){
                        maxElement=maxStack.peek();
                    }
                    else{
                        maxElement=Integer.MIN_VALUE;
                    }
                }
                if(!stackOfElements.isEmpty())
                    stackOfElements.pop();
                break;
            case 3:
                if(!maxStack.isEmpty())
                    resultLists.add(maxStack.peek());
                break;
            }
            ++times;
        }
        for(Integer i: resultLists){
            System.out.println(i);
        }
    }
}
