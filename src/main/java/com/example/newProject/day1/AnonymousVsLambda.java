package com.example.newProject.day1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnonymousVsLambda {

    public static void main (String[] args){

        String name = "Sai Kumar Tulugu";

        AnonymousClassExampleInterface anInterface = new AnonymousClassExampleInterface() {
            @Override
            public String findOutNonRepeateFirstCharacter(String input) {
                input= AnonymousClassExampleInterface.provideUpperCase(input);
                return input.chars().mapToObj(c ->(char)c)
                        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                        .entrySet()
                        .stream()
                        .filter(characterLongEntry -> characterLongEntry.getValue()==1)
                        .map(Map.Entry::getKey)
                        .findFirst()
                        .get().toString();
            }
        };
        System.out.println("From Anonymous class: : "+anInterface.findOutNonRepeateFirstCharacter(name));

        AnonymousClassExampleInterface anInterface1 = (input) ->{
            input = AnonymousClassExampleInterface.provideUpperCase(input);
            return input.chars().mapToObj(c ->(char)c)
                    .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                    .entrySet()
                    .stream()
                    .filter(characterLongEntry -> characterLongEntry.getValue()==1)
                    .map(Map.Entry::getKey)
                    .findFirst()
                    .get().toString();
        };
        System.out.println("From Lambda Expression : " +anInterface1.findOutNonRepeateFirstCharacter(name));
    }
}
