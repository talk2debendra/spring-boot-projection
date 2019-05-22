package com.deb.poc.springbootprojection;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleClientService {

	
	@Autowired
	  private EmployeeRepository repo;

	  public void create() {
	      List<Employee> employees = createEmployees();
	      repo.saveAll(employees);

	      System.out.println(" -- finding all employees --");
	      Iterable<Employee> all = repo.findAll();
	      all.forEach(System.out::println);

	      System.out.println(" -- finding all EmployeeSalary --");
	      List<EmployeeSalary> list = repo.findBy();
	      for (EmployeeSalary es : list) {
	          System.out.printf("Name: %s, Salary: %s%n", es.getName(), es.getSalary());
	      }

	      System.out.println(" -- finding the EmployeeSalary in IT dept --");
	      list = repo.findByDept("IT");
	      for (EmployeeSalary es : list) {
	          System.out.printf("Name: %s, Salary: %s%n", es.getName(), es.getSalary());
	      }
	  }

	  private List<Employee> createEmployees() {
	      return Arrays.asList(
	              Employee.create("Diana", "Admin", 3000),
	              Employee.create("Mike", "IT", 1000),
	              Employee.create("Rose", "Admin", 4000),
	              Employee.create("Sara", "Admin", 3500),
	              Employee.create("Tanaka", "IT", 3000),
	              Employee.create("Charlie", "IT", 4500)
	      );
	  }
}
