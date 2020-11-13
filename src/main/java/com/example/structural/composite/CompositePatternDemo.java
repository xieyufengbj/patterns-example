package com.example.structural.composite;

/**
 * Copyright (C), 2020
 * FileName: CompositePatternDemo
 *
 * @author: xieyufeng
 * @date: 2020/11/12 15:16
 * @description:
 */
public class CompositePatternDemo {

    public static void main(String[] args) {
        Employee ceo = new Employee("JONI", "CEO", 30000);
        Employee cmo = new Employee("TONY", "chief marketing officer", 20000);
        Employee marketer1 = new Employee("feng", "marketer", 10000);
        Employee marketer2 = new Employee("fang", "marketer", 10000);

        Employee cso = new Employee("XIXI", "chief sales officer", 20000);
        Employee salesman1 = new Employee("zhangsan", "salesman", 10000);
        Employee salesman2 = new Employee("lisi", "salesman", 10000);

        ceo.add(cmo);
        ceo.add(cso);
        cmo.add(marketer1);
        cmo.add(marketer2);
        cso.add(salesman1);
        cso.add(salesman2);

        // 打印该组织所有员工
        System.out.println(ceo);
        for (Employee headEmployee : ceo.getSubordinate()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinate()) {
                System.out.println(employee);
            }
        }
    }
}
