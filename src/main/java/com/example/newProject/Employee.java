package com.example.newProject;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Employee{
    private String name;
    private String id;
    private String department;
    private Double salary;
    public Employee(String name, String id, String department, Double salary){
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }
}
