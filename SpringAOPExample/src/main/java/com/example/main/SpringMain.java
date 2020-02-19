package com.example.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.service.EmployeeService;

public class SpringMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);

		// calling getEmployee will invoke Advise depending on pointcuts
		// calling setName will invoke advise depending on pointcuts
		employeeService.getEmployee().setName("Pankaj");

		// calling getEmployee will invoke Advise depending on pointcuts
		// calling getName will invoke advise depending on pointcuts
		System.out.println(employeeService.getEmployee().getName());

		// throwException will invoke Advise depending on pointcuts
		employeeService.getEmployee().throwException();

		ctx.close();
	}

}
