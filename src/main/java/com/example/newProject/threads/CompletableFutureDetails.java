package com.example.newProject.threads;

import com.example.newProject.Employee;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureDetails {
    public static void main (String[] args){
        ExecutorService service = Executors.newFixedThreadPool(5);
        CompletableFuture<Void> completableFuture = CompletableFuture.supplyAsync(()->{
            return new Employee("Sai","1","Software", 20000000.0);
        },service).thenApply(employee -> {
            if(employee.getName().equals("Sai"))
                return employee;
            return employee;
        }).thenAccept(System.out::println);
        service.shutdown();
    }
}
