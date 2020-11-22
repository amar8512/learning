package com.noida.learning.threads;

public class MutlitThreading {

    public static void main(String[] args) {
        System.out.println("I will be executed first");
        Thread t1 = new Thread(() -> {
            System.out.println("Printing something");
        });
        Runnable r1 = () -> {
            System.out.println("Printing the method in Thread1");
        };
        Thread t2 = new Thread(r1);
        Thread t3 = new Thread(r1);
        Thread t4 = new Thread(r1);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}

