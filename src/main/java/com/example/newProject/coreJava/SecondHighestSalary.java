package com.example.newProject.coreJava;

import com.example.newProject.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondHighestSalary {

    public static void main(String[] args){
        Employee sai = new Employee("Sai", "123", "Software", 16.0);
        Employee gayathri = new Employee("Gayathri", "123", "Accounts", 14.5);
        Employee someone = new Employee("Someone", "123", "Accounts", 15.0);
        List<Employee> employees = List.of(sai, gayathri, someone);
        /*findOutNthHighestSalary(employees,2);
        groupEmployeesByDepartment(employees);
        countEmployeesByDepartment(employees);*/
//        List<String> elements = List.of("Sai","Gayathri","Sai");
//        findDuplicateElements(elements);
//        frequencyMap(elements);
        sortBySalaryAndName(employees);
    }

    private static void sortBySalaryAndName(List<Employee> employees) {
        List<Employee> sortedEmployees = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).thenComparing(Employee::getName)).toList();
        System.out.print(sortedEmployees);
    }

    private static void frequencyMap(List<String> elements) {
        Map<String,Long> frequecnyMap = elements.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        System.out.println(frequecnyMap);
    }

    private static void findDuplicateElements(List<String> elements) {
        String duplicate = elements.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                        .entrySet().stream().filter(entry -> entry.getValue()>1).
                map(Map.Entry::getKey).findFirst().orElseThrow();

        String secondWay = elements.stream().filter(element -> Collections.frequency(elements,element)>1).findFirst().orElseThrow();
        System.out.println(secondWay);
    }

    private static void countEmployeesByDepartment(List<Employee> employees) {
        Map<String,Long> countOfEmployees = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(countOfEmployees);
    }

    private static void groupEmployeesByDepartment(List<Employee> employees) {
        Map<String,List<Employee>> employeeList = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(employeeList);

    }

    public static void findOutNthHighestSalary(List<Employee> employees,int index){

        if(index>employees.size())
            throw new RuntimeException("Index won't allow as List doesn't contain those many employees");
        Employee sortedList = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(index-1).findFirst().orElseThrow();
        System.out.println(sortedList);
    }
}
