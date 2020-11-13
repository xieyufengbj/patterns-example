package com.example.structural.composite;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C), 2020
 * FileName: Employee
 *
 * @author: xieyufeng
 * @date: 2020/11/12 16:47
 * @description:
 */
@Data
public class Employee {

    private String name;

    private String dept;

    private int salary;

    private List<Employee> subordinate;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinate = new ArrayList<>();
    }

    public void add(Employee e) {
        subordinate.add(e);
    }

    public void remove(Employee e) {
        subordinate.remove(e);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
