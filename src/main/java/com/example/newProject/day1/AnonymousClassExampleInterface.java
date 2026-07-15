package com.example.newProject.day1;
@FunctionalInterface
public interface AnonymousClassExampleInterface {
    public static String provideUpperCase(String input){
        return input.toUpperCase();
    }
    public String findOutNonRepeateFirstCharacter(String input);
}
