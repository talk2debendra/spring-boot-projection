package com.deb.poc.springbootprojection;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	List<EmployeeSalary> findBy();
	List<EmployeeSalary> findByDept(String dept);
}
