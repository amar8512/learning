package com.company;

class MyLockingClass{
    public static void printAnything(){
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void print(){
        System.out.println("Else");
    }
}

public class StaticLocking {
    public static void main(String[] args) {
       Runnable runnable = ()->{
       };
       Thread t1 = new Thread(runnable);
    }
}


