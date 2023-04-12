package org.practice.thread.excerise.Sync;

public class SyncTest {
    public SyncTest() {
    }

    public static void main(String[] args) throws InterruptedException {
        final Increment obj = new Increment();
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                for(int i = 0; i < 1000; ++i) {
                    obj.increment();
                }

            }
        });
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                for(int i = 0; i < 1000; ++i) {
                    obj.increment();
                }

            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Count: " + obj.count);
    }
}
