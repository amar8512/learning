package com.noida.learning.threads;

public class MutiThreadingDemonstartion {
    public static void main(String[] args) throws InterruptedException {
        SumExample.runTests();
    }


}

class SumExample{
    long startRange;
    long endRange;
    long counter = 0;
    static long MAX_NUM = Integer.MAX_VALUE;

    SumExample(long startRange, long endRange){
        this.startRange=startRange;
        this.endRange=endRange;
    }
    public void add(){
        for(long i=startRange;i<=endRange;i++){
            counter = counter+i;
        }
    }

    public static void runTests() throws InterruptedException{
        oneThread();
        twoThread();
    }
    public static void oneThread(){
        long start =System.currentTimeMillis();
        SumExample s1 = new SumExample(1,MAX_NUM);
        s1.add();
        long end = System.currentTimeMillis();
        System.out.println("Single threaded type took : "+(end-start));
    }
    public static void twoThread() throws  InterruptedException{
        long start =System.currentTimeMillis();
        SumExample s1 = new SumExample(1,MAX_NUM/2);
        SumExample s2 = new SumExample(MAX_NUM/2+1,MAX_NUM);



        Thread t1 = new Thread(()->
                s1.add()
        );
        Thread t2 = new Thread(()->
                s2.add()
        );
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        long end = System.currentTimeMillis();
        System.out.println("Multi threaded type took : "+(end-start));
    }
}