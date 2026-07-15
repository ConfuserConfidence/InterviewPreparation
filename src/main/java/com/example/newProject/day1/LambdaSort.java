package com.example.newProject.day1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaSort {
    //Write a lambda to sort employees by salary, then by name
    public static void main(String[] args){
        List<Employee> employeeList = new java.util.ArrayList<>(List.of(new Employee[]{new Employee("1", "Sai", "Software", Double.valueOf("2000000"))
                , new Employee("2", "Rahul", "Software", Double.valueOf("1000000")),
                new Employee("3", "Sampath", "Medical", Double.valueOf("5000000"))}));
        List<Employee> sortedList = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName)).toList();
        Comparator comparator = Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName);
        Collections.sort(employeeList, Comparator.comparing(Employee::getSalary) .thenComparing(Employee::getName));
        System.out.println(employeeList);
    }
}
