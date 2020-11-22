package com.noida.learning.threads;

import com.noida.learning.java.CoffeeSize;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CPDemo {
    public static void main(String[] args) throws  InterruptedException{
        ConsumerProducer obj = new ConsumerProducer();
        Thread t1 = new Thread(()->{
            try {
                obj.produce();
            }
            catch (InterruptedException exc){
                exc.printStackTrace();
            }
        });
        Thread t2 = new Thread(()->{
            try {
                obj.consume();
            }
            catch (InterruptedException exc){
                exc.printStackTrace();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}

class ConsumerProducer{

    public static  final Integer SIZE =10;
    private Queue<Integer> listOfIntegers = new LinkedList<>();
    int count =0;

    public void produce() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (listOfIntegers.size() == SIZE)
                    wait();
                System.out.println("Producing the value " + count);
                listOfIntegers.add(++count);
                notify();
                Thread.sleep(10000);
            }
        }
    }

    public void consume() throws  InterruptedException {
        int i = 0;
        while (true) {
            synchronized (this) {
                while (listOfIntegers.size() == 0)
                    wait();
                System.out.println("The value removed is " + listOfIntegers.poll());
                notify();
                Thread.sleep(1000);
            }
        }
    }
}