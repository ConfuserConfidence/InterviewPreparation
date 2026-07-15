package com.example.newProject;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMap {
    public static void main(String[] args){
        List<Employee> employees = createListOfEmployees();
        List<Employee> employees2 = Arrays.asList(new Employee[]{
                new Employee("Sai", "1", "Software", Double.valueOf("200000")),
                new Employee("Gayathri", "2", "Software", Double.valueOf("150000")),
                new Employee("Siva", "3", "Electrical", Double.valueOf("100000")),
                new Employee("Ravi", "3", "Electrical", Double.valueOf("100000")),
        });
        List<List<Employee>> employeesOfEmployees = Arrays.asList(employees,employees2);
        employeesOfEmployees.stream().flatMap(List::stream).toList().forEach(System.out::println);

    }


















    private static List<Employee> createListOfEmployees() {
        return Arrays.asList(new Employee[]{
                new Employee("Sai", "1", "Software", Double.valueOf("200000")),
                new Employee("Gayathri", "2", "Software", Double.valueOf("150000")),
                new Employee("Siva", "3", "Electrical", Double.valueOf("100000")),
                new Employee("Ravi", "3", "Electrical", Double.valueOf("100000")),
        });
    }
}
