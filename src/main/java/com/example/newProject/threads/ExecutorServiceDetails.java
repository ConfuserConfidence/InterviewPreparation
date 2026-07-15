package com.example.newProject.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDetails {
    private static int THREAD_COUNT = 5;

    public static void main (String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(5);
        Runnable runnable = ()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Sai Krishna is good boy "+ Thread.currentThread().getName());
        };

        List<Future> futureList = new ArrayList<>();
        for (int i = 0; i < THREAD_COUNT; i++) {
            futureList.add(service.submit(runnable));
        }
        futureList.forEach(future -> {
            if(future.isDone()) {
                try {
                    future.get();
                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        service.shutdown();

    }
}
