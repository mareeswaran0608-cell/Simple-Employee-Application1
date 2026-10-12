
package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        EmployeeService service =
                context.getBean(EmployeeService.class);

        service.addEmployee("Sathya");
        service.displayEmployee(101, "Sathya");
        service.calculateSalary(25000.0);

        context.close();
    }
}
