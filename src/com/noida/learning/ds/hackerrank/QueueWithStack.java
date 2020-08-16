package com.noida.learning.ds.hackerrank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class QueueWithStack {
    static Stack<Integer> oldStack = new Stack<Integer>();
    static Stack<Integer> newStack = new Stack<Integer>();
    static List<Integer> listOfElements = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);



    public static void enque(){
        newStack.push(scan.nextInt());
    }
    public static void moveStackElements(){
        if(oldStack.isEmpty()){
            while(!newStack.isEmpty()){
                oldStack.push(newStack.pop());
            }
        }
    }
    public static void deque( ){
        moveStackElements();
        oldStack.pop();
    }

    public static Integer peekHead(){
        moveStackElements();
        return oldStack.peek();
    }
    public static void main(String[] args) {

        int t = scan.nextInt();
        int times=0;
        int selection;
        int result;
        while(times<t){
            selection = scan.nextInt();
            switch(selection){
            case 1:
                 Integer input=scan.nextInt();
                enque();
                break;
            case 2:
                deque();
                break;
            case 3:
                result=peekHead();
                break;
            }
            ++t;
        }
        for(Integer i:listOfElements){
            System.out.print(i);
        }
    }
}
