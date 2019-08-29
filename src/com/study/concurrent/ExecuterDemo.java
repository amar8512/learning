package com.study.concurrent;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;;
public class ExecuterDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor tplExecuter = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        for (int i = 0; i <10 ; i++) {
            tplExecuter.submit(new Task(i));
        }
        tplExecuter.shutdown();
        try {
            tplExecuter.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            System.out.println("Ending all the task");
        } catch (InterruptedException e) {

        }
        //amvvv
        //kemmmm
        //hhhhmmmmmmmmmmmmmmmm amar.
        //aswd123ammmmmmm
        //aswd123  y


    }

}

class Task implements Runnable {
    int id;
    Task(int id){
        this.id = id;
    }
    @Override
    public void run() {
      System.out.println("Starting the thread "+id);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ending the thread "+id);
    }
}
