package com.example.newProject.TimeBased;

public class Execution {

    public static void main (String args[])
    {
        TimeMap map = new TimeMap();
        map.set("Sai", "Gayathri",3);
        map.set("Sai", "Jagadamba",7);
        System.out.println(map.get("Sai",2));
    }
}
