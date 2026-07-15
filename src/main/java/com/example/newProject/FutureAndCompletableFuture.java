package com.example.newProject;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class FutureAndCompletableFuture {

    public static void main(String[] args){
        ExecutorService executor = Executors.newFixedThreadPool(5);
        IntStream.range(1,10).forEach(i->{
            CompletableFuture.runAsync(()->{
                System.out.println("It is running on thread "+Thread.currentThread());
                try {
                    Thread.sleep(1000);
                }catch (IllegalArgumentException | InterruptedException iae){
                    System.out.println(iae.getLocalizedMessage());
                }
            },executor).thenAccept(System.out::println);
        });

        executor.shutdown();
    }
}
