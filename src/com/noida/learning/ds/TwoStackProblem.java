package com.noida.learning.ds;

import com.noida.learning.ds.exception.MessageConstants;
import com.noida.learning.ds.exception.UnderFlowExcepiton;


import java.util.Scanner;
import java.util.Stack;

public class TwoStackProblem {
    public static Scanner scan = new Scanner(System.in);
    static int choice;
    static Stack<Integer> s1 = new Stack();
    static Stack<Integer> s2 = new Stack();

    public static void enQueue(int num) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(num);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public static int deQueue() throws UnderFlowExcepiton {
        if (s1.isEmpty()) {
            throw new UnderFlowExcepiton(MessageConstants.UNDERFLOW_ERROR_STACK);
        }
        return s1.pop();
    }

    public static void main(String[] args) throws UnderFlowExcepiton {
        do {
            System.out.println("Please enter a choice");
            System.out.println("1 for Enqueue..");
            System.out.println("2 for dequeue....");
            System.out.println("3 for Exit");

            int choice = scan.nextInt();
            int num;
            switch (choice) {
                case 1:
                    System.out.println("Please enter the number ::");
                    num = scan.nextInt();
                    enQueue(num);
                    break;
                case 2:
                    System.out.println("The number dequeued is  " + deQueue());
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice ... please enter a valid number");
                    break;
            }

        }
        while (choice != 3);
    }
}
