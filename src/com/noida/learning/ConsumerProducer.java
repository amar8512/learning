package com.company;

import java.util.LinkedList;
import java.util.Queue;

class Items{
    Queue<Integer> listOfValues;
    int size;
    Items(int size){
      this.size= size;
      this.listOfValues= new LinkedList<>();
    }
    public void produce() throws  InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                if (listOfValues.size() == size) {
                    wait();
                }
                listOfValues.add(value);
                System.out.println("The value produced is " + value);
                ++value;
                notify();
                Thread.sleep(1000);
            }
        }
    }
    public void consume() throws InterruptedException{
        int value;
       while (true){
           synchronized(this){
               if(listOfValues.size()==0){
                   wait();
               }
               value = listOfValues.poll();
               System.out.println("The value consumed is "+value);
               notify();
               Thread.sleep(1000);
           }
       }
    }
}
public class ConsumerProducer {
    public static void main(String[] args) throws InterruptedException {
        Items buffer = new Items(10);

            Runnable r1 = () -> {
            try {
                buffer.produce();
            }
            catch (InterruptedException exc){
                System.out.println(exc.toString());
            }
        };
        Runnable r2 = () -> {
            try {
                buffer.consume();
            }
            catch (InterruptedException exc){
                System.out.println(exc.toString());
            }
        };

        Thread t1 =new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        }

    }



