package com.noida.learning.threads;

public class ThreadNamingConvention {

    public static void main(String[] args) {
        System.out.println("Main thread started");
        System.out.println(Thread.currentThread().getName());
        Runnable r1=()->{
         for(int i=0;i<10;i++){
             System.out.println("Value of i is "+i+" and run by the thread "+Thread.currentThread().getName());
         }
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        Thread t3 = new Thread(r1);
        t1.setName("Jim");
        t2.setName("Robert");
        t3.setName("Joe");
        t1.start();
        t2.start();
        t3.start();
        System.out.println(Thread.currentThread().getName());
    }
}
