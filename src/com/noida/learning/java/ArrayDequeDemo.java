package com.noida.learning.java;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(1);
        arrayDeque.add(2);
        arrayDeque.add(3);
        arrayDeque.add(4);
        arrayDeque.add(5);

        int i=arrayDeque.pollFirst();
        System.out.println(" "+i);
        arrayDeque.addFirst(7);
        arrayDeque.addLast(8);
        arrayDeque.pollFirst();
        arrayDeque.pollLast();
        System.out.println(arrayDeque);
    }
}
