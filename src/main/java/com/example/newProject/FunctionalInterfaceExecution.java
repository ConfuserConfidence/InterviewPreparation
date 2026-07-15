package com.example.newProject;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionalInterfaceExecution {

    public static void main(String[] args) {
        VehicleFunctionalInterface vehicleFunctionalInterface = (lorry) -> System.out.println(lorry + " Driving");
        vehicleFunctionalInterface.drive("Lorry");

        //Filter and map
        List<Employee> employees = Arrays.asList(new Employee[]{
                new Employee("Sai", "1", "Software", Double.valueOf("200000")),
                new Employee("Gayathri", "2", "Software", Double.valueOf("150000")),
                new Employee("Siva", "3", "Electrical", Double.valueOf("100000")),
                new Employee("Ravi", "3", "Electrical", Double.valueOf("100000")),
        });
        employees
                .stream()
                .filter(employee -> employee.getDepartment().equalsIgnoreCase("Software")
                        && employee.getSalary().compareTo(Double.valueOf("150000")) > 0)
                .map(Employee::getName).forEach(name -> System.out.println(name));

        //First Non repeating character
        String input = "Sai Kumar Tulugu";
        System.out.println(input.chars()
                .mapToObj(character -> (char) character)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entrySet -> entrySet.getValue() == 1)
                .findFirst().get().getKey());

        //Max Salary
        System.out.println(employees.stream().max(Comparator.comparing(Employee::getSalary)).get().getName());
        //Sorting
        System.out.println(employees.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList()));
        //max salary in each department
        Map<String,Double> employeeMap = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)), optional->optional.get().getSalary()
                        )));
        System.out.println(employeeMap);
        //alternate to max salary
        Map<String,Double> alternateMap = employees.stream().
                collect(Collectors.toMap(
                        Employee::getDepartment,
                        Employee::getSalary,
                        BinaryOperator.maxBy(Double::compare)
                ));
        System.out.println(alternateMap);
        List<String> stirngList = Arrays.asList("Go","Java","Simple","Backside");
        List<String> newLList = stirngList.stream().sorted(Comparator.comparing(string->string)).collect(Collectors.toList());
        System.out.println(newLList);

        List<Integer> integers = Arrays.asList(1,2,3,4);
        List<Integer> newListInteger = integers.stream().map(integer-> integer*integer).collect(Collectors.toList());
        System.out.println(newListInteger);


        employees.stream().collect(
                Collectors.toMap(Employee::getDepartment,
                        Employee::getSalary,
                        BinaryOperator.maxBy(Double::compareTo))

        );

        employees.stream().collect(
                Collectors.groupingBy(Employee::getDepartment, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),optional-> optional.get())
        ));
        //ATM Solution
        int amount=2600;
        int[] denominatoins = {500,100};
        int noteCount = 0;
        for (int i=0; i<denominatoins.length;i++){
            if(amount >= denominatoins[i]){
                noteCount += amount/denominatoins[i];
                amount = amount-(noteCount*denominatoins[i]);
            }
        }
        System.out.println(noteCount);

    }


}

