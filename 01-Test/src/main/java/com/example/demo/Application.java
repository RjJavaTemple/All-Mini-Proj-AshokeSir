package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.EController.EmployeeController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ApplicationContext ctx=SpringApplication.run(Application.class, args);
	EmployeeController emp=ctx.getBean("employeeController",EmployeeController.class);
	System.out.println(emp);
	System.out.println("The Data Are Saved Sucess....!!");
	}

}
