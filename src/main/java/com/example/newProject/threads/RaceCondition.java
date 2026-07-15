package com.example.newProject.threads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RaceCondition {

    public static void main (String[] args) throws InterruptedException {
        Map<String,Integer> map = new ConcurrentHashMap<>();
        Thread thread = new Thread(()->{
            addObjectsInMap(map);
        });
        Thread thread2 = new Thread(()->{
            addObjectsInMap(map);
        });
        thread.start();
        thread2.start();
        Thread.sleep(3000);
        System.out.println("Map Size :"+ map.size());
    }

    private static void addObjectsInMap(Map<String, Integer> map) {
        for (int i = 0; i < 500; i++) {
            map.put("a"+i, i);
        }
    }
}
