package org.example.connectionPool.examples;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Deadlock {
    private static final Logger LOGGER = LogManager.getLogger(Deadlock.class);

    public static void lock() {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread thread1 = new Thread(() -> {
            LOGGER.info("Thread 1 started");
            synchronized (lock1){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock2){
                }
            }
            LOGGER.info("Thread 1 finished");
        }, "thread1");

        Thread thread2 = new Thread(() -> {
            LOGGER.info("Thread 2 started");
            synchronized (lock2){
                synchronized (lock1){
                }
            }
            LOGGER.info("Thread 2 finished");
        }, "thread2");
        thread1.start();
        thread2.start();
    }
}
