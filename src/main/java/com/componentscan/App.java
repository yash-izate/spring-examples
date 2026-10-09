package com.componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("componentScanDemo.xml");

        Employee employee = context.getBean("employee", Employee.class);
        employee.setEmployeeId(1001);
        employee.setFirstName("Yash");
        employee.setLastName("Izate");
        employee.setSalary(10000.86);
        System.out.println(employee.toString());
    }
}