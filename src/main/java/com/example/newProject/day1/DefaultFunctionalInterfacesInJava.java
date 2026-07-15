package com.example.newProject.day1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DefaultFunctionalInterfacesInJava {

    public static void main(String[] args){

        //Default Functional Interface Consumer
        Consumer<String> consumer = consumeHere -> System.out.println("This is consumer method testing "+consumeHere);
        consumer.accept("By Sai Kumar Tulugu");

        //Default Functional Interface Supplier
        Supplier supplier = () -> "This is returned from Supplier";
        System.out.println(supplier.get());

        //Default Functional Interface Function
        Function<String,String> function = (name)-> "This is the input name "+name;
        System.out.println(function.apply("Sai Kumar"));

        //Default Functional Interface Predicate
        Predicate<String> predicate = (compareName)-> compareName.equalsIgnoreCase("SaiKumar Tulugu");
        System.out.println(predicate.test("saiKumar Tulugu"));
    }
}
