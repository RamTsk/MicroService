package org.practice.thread.excerise.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceImple {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Runnable() {
            public void run() {
                System.out.println("This is execute() method example");
            }
        });
        executorService.shutdown();
        ExecutorService executorService1 = Executors.newFixedThreadPool(1);
        Future obj = executorService1.submit(new Callable() {
            public Object call() {
                System.out.println("This is submit() method example");
                return "Returning Callable Task Result";
            }
        });
        System.out.println(obj.get());
        executorService.shutdown();
    }
}
