package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Problem statement: Create a list of 1000 employees and calculate average salary of all employees
 * Provide increment of 15% for grade G3, 10% for G2, 5% for G1
 */
class Employee {
    private int empId;
    private String grade;
    private String name;
    private double salary;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class StreamExample {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        for (int i=0; i < 5; i++) {
            Employee e = new Employee();
            e.setEmpId(i);
            e.setName("E"+i);
            e.setSalary(Math.random()*1000);
            employeeList.add(e);
        }

        double avgSalary = employeeList.stream().collect(Collectors.averagingDouble(employee -> employee.getSalary()));

        employeeList.stream().map(e -> {
            String grade = e.getGrade();
            switch (grade) {
                case "g1":
                    e.setSalary(e.getSalary() * 0.05);
                    break;
                case "g2":
                    e.setSalary(e.getSalary() * 0.10);
                    break;
                case "g3":
                    e.setSalary(e.getSalary() * 0.15);
                    break;
            }
            return e;
        }).collect(Collectors.toList());
    }

}
