package com.noida.learning.threads;

import java.util.Random;

public class CriticalSectionThreadSafe{
    public static void main(String[] args) throws InterruptedException {
        CriticalDatas.test();
    }



}
class CriticalDatas {
    int randInt=0;
    Random random = new Random(System.currentTimeMillis());
    public  void print(){
        int i=1000000;
        while(i!=0) {
            if (randInt % 5 == 0) {
                if (randInt % 5 != 0) {
                    System.out.println("" + randInt);
                }
            }
            --i;
        }
    }
    public void changeState(){
        int i=1000000;
        while(i!=0){
            randInt = random.nextInt(1000);
            i--;
        }

    }
    public static  void test() throws InterruptedException{
        CriticalDatas criticalData = new CriticalDatas();

        Thread printerThread  = new Thread(){
            @Override public void run() {
                criticalData.print();
            }
        };
        Thread changerThread = new Thread(){
            @Override public void run() {
                criticalData.changeState();
            }
        };
        printerThread.start();
        changerThread.start();
        printerThread.join();
        changerThread.join();
    }
}
