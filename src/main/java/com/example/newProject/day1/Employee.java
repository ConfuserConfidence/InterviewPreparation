package com.example.newProject.day1;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Employee {

    private String id;
    private String name;
    private String department;
    private Double salary;
    public Employee(String id,String name,String department,Double salary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}
