package com.noida.learning.ds;

import java.util.ArrayList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(-1);
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(stack.peek());
        System.out.println(arrayList.toString());
    }
}
