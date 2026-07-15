package com.example.newProject.coreJava;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepititiveChar {

    public static void main (String[] args){
        findOutNonRepititiveCharInString("somethingisgoiningon");
        findOutDuplicateCharInString("omethingisgoiningon");
    }

    private static void findOutDuplicateCharInString(String somethingisgoiningon) {
        char duplicate = somethingisgoiningon.chars().mapToObj(c-> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream().
                filter(entry -> entry.getValue()>1)
                .findFirst()
                .get().getKey();
        System.out.println("Duplicate : "+duplicate);

    }

    private static void findOutNonRepititiveCharInString(String somethingisgoiningon) {
        char nonrepeat = somethingisgoiningon.chars().mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue()==1)
                .findFirst().get().getKey();
        System.out.println("Non Repeat :"+nonrepeat);
    }
}
