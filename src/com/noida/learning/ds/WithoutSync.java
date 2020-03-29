package com.noida.learning.ds;

public class WithoutSync {
    private static final int NUM_EXECUTIONS = 100000000;

    private static void someLongOperation() { /* NO-OP */ }
    public static final Object mutexLock = new Object();
    public static void main(String[] args) {

        final long[] numElements = {0};

        Thread incrementThread = new Thread() {

            @Override
            public void run() {
                for (long count = 0; count < NUM_EXECUTIONS; count++) {
                    someLongOperation();
                    synchronized (mutexLock) {
                        numElements[0] += 1;
                    }
                }
            }
        };

        Thread decrementThread = new Thread() {

            @Override
            public void run() {
                for (long count = 0; count < NUM_EXECUTIONS; count++) {
                    someLongOperation();
                    synchronized (mutexLock) {
                        numElements[0] -= 1;
                    }
                }
            }
        };

        // Start the threads
        incrementThread.start(); decrementThread.start();

        // Wait for jobs to finish
        try { incrementThread.join(); decrementThread.join(); }
        catch (InterruptedException e) { /* NO-OP */ }

        // Print the result
        System.out.println("Result is: " + numElements[0]);
    }
}
