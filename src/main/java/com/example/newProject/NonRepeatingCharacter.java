package com.example.newProject;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingCharacter {

    public static Character getNonRepeatingCharacter(String input){
        input = input.toLowerCase();
        return input.chars().mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream()
                .filter(entrySet -> entrySet.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }

    public static void main(String args[]){
        System.out.println(getNonRepeatingCharacter("GayathriG"));
    }
}
