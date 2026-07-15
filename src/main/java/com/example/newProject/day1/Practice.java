package com.example.newProject.day1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice {

    public static char findOutNonRepeatedFirstChararcterInString(String input){
        return input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entrySet-> entrySet.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst().get();
    }
    public static List<Employee> sortByNameDeptSal(List<Employee> employees){
        employees.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getDepartment).thenComparing(Employee::getSalary));
        return employees;
//        return employees.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getDepartment).thenComparing(Employee::getSalary)).toList();
    }

    public static void main (String[] args){
        System.out.println(findOutNonRepeatedFirstChararcterInString("Tulugu Sai Kumart"));
        List<Employee> employees = List.of(new Employee("123","sai","software",Double.valueOf(20000)),
                new Employee("123","Gayathri","software",Double.valueOf(20000)),
        new Employee("123","Gayathri","doftware",Double.valueOf(20000)),
        new Employee("123","Gayathri","software",Double.valueOf(10000)));

        List<Employee> employeeList = new ArrayList<>();
        Employee employee1 = new Employee("123","sai","software",Double.valueOf(20000));
        Employee employee2 = new Employee("123","Gayathri","software",Double.valueOf(20000));
        employeeList.add(employee1);
        employeeList.add(employee2);
        System.out.println(sortByNameDeptSal(employeeList));
    }
}
