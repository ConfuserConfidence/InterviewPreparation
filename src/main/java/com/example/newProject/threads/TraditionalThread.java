package com.example.newProject.threads;

public class TraditionalThread {

    public static void main (String[] args){
        Runnable task = ()->{
            System.out.println("Sai Kumar is a good boy");
            System.out.println("CurrentThread in Task: "+Thread.currentThread().getName());
        };
        Runnable task1 = ()->{
            System.out.println("Sai Kumar is a bad boy");
            System.out.println("CurrentThread in Task1: "+Thread.currentThread().getName());
        };
        Thread thread = new Thread(task);
        Thread thread1 = new Thread(task1);
        thread.start();
        thread1.start();;
    }
}
