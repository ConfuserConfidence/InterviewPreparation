package com.example.newProject;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {

    public static Character firstNonRepeating(String input){
        input = input.toLowerCase();
        return input.chars().mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream()
                .filter(characterLongEntry -> characterLongEntry.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }
    public static void main (String args[]){
        System.out.println(firstNonRepeating("SaiKrishna Tulugu"));
    }
}
