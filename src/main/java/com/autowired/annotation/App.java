package com.autowired.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Employee employee = context.getBean("employee", Employee.class);
        employee.setEmployeeId(1001);
        employee.setFirstName("Yash");
        employee.setLastName("Izate");
        employee.setSalary(10000.86);
        System.out.println(employee.toString());

        Manager manager = context.getBean("manager", Manager.class);
        System.out.println(manager.toString());
    }
}