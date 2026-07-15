package com.example.newProject.threads;

import com.example.newProject.Employee;

public class DeadLockCreation {

    public static final Employee employee = new Employee("Sai","1","Software", 20000000.0);
    public static final Employee employee1 = new Employee("Sai","1","Software", 20000000.0);

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(()->{
            synchronized (employee){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (employee1){
                    System.out.println("Locked 1");
                }
            }
        });
        Thread thread2 = new Thread(()->{
            synchronized (employee1){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (employee){
                    System.out.println("Locked 2");
                }
            }
        });
        thread1.start();
        thread2.start();

    }
}
