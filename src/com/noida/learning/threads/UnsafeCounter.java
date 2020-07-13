/*package com.noida.learning.threads;

import java.util.Random;

class UnsafeCounterMain{
 int count = 0;
  public void increment(){
      count--;
  }
  public void decrement(){
      count++;
  }
  public void finalValueOfCounter(){
      System.out.println("Final Value of counter is "+count);
  }
}
 class UnsafeCounter {
     static Random random = new Random(System.currentTimeMillis());

     public static void main(String[] args) throws InterruptedException{
         UnsafeCounterMain unsafeCounter = new UnsafeCounterMain();
        Thread t1 = new Thread(()->{
           for(int i=0;i<100;i++){
               unsafeCounter.increment();
               sleepRandomlyForLessThan10Secs();
           }
        });
         Thread t2 = new Thread(()->{
            unsafeCounter.decrement();
            sleepRandomlyForLessThan10Secs();
         });
         t1.start();
         t2.start();
         t1.join();
         t2.join();
         unsafeCounter.finalValueOfCounter();
    }

    public static void sleepRandomlyForLessThan10Secs(){
        try{
           Thread.sleep(random.nextInt(10));
        }
        catch(InterruptedException ie){

        }

    }
}*/


import java.util.Random;

class DemoThreadUnsafe {

    // We'll use this to randomly sleep our threads
    static Random random = new Random(System.currentTimeMillis());

    public static void main(String args[]) throws InterruptedException {

        // create object of unsafe counter
        ThreadUnsafeCounter badCounter = new ThreadUnsafeCounter();

        // setup thread1 to increment the badCounter 200 times
        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    badCounter.increment();
                    DemoThreadUnsafe.sleepRandomlyForLessThan10Secs();
                }
            }
        });

        // setup thread2 to decrement the badCounter 200 times
        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    badCounter.decrement();
                    DemoThreadUnsafe.sleepRandomlyForLessThan10Secs();
                }
            }
        });

        // run both threads
        thread1.start();
        thread2.start();

        // wait for t1 and t2 to complete.
        thread1.join();
        thread2.join();

        // print final value of counter
        badCounter.printFinalCounterValue();
    }

    public static void sleepRandomlyForLessThan10Secs() {
        try {
            Thread.sleep(random.nextInt(10));
        } catch (InterruptedException ie) {
        }
    }
}

class ThreadUnsafeCounter {

    int count = 0;

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    void printFinalCounterValue() {
        System.out.println("counter is: " + count);
    }
}