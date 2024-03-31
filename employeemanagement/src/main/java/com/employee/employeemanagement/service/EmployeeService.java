package com.employee.employeemanagement.service;

import java.util.List;

import com.employee.employeemanagement.entity.Employee;

public interface EmployeeService {

	Employee createEmployee(Employee employee);
	List<Employee> getAllEmployee();
	Employee getEmployeeById(long empId);
	Employee updateEmployee(long empId, Employee employee);

}
