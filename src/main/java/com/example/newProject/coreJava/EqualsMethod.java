package com.example.newProject.coreJava;

import com.example.newProject.Employee;

import java.util.LinkedList;
import java.util.List;

public class EqualsMethod {

    public static void main(String[] args){
        Employee employee = new Employee("something","somehing","something", 4000.0);
        Employee employee2 = new Employee("something","somehing","something", 4000.0);
        System.out.println(employee.equals(employee2));
        System.out.println(employee);
        System.out.println(employee2);
        List<String> list= new LinkedList<>();
    }
}
