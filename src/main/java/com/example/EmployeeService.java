
package com.example;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    public void addEmployee(String name) {
        System.out.println("Employee added: " + name);
    }

    public void displayEmployee(int id, String name) {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }

    public void calculateSalary(double salary) {
        System.out.println("Employee Salary: " + salary);
    }
}
