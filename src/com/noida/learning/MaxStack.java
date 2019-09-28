package com.company;


import java.util.Stack;

public class MaxStack {
    static int max;
    public static void checkIfNullElement(Integer i ) throws Exception{

    }
    public static int findMaxValueInStack(Stack<Integer> stack){
        int size = stack.size();
        int arr[] = new int[size];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            arr[i]=stack.pop();
           if(arr[i]>max){
               max=arr[i];
           }
        }
        for(int i= size-1;i>=0;i--){
            stack.push(arr[i]);
        }
        return  max;
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(null);
        stack.push(null);
        stack.push(null);
        stack.push(null);
        stack.push(null);
        System.out.println("MAX element in the stack is "+findMaxValueInStack(stack));
    }
}
