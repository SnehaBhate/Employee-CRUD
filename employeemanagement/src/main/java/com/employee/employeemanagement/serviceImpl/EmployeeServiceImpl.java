package com.employee.employeemanagement.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.employeemanagement.entity.Employee;
import com.employee.employeemanagement.repository.EmployeeRepository;
import com.employee.employeemanagement.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee createEmployee(Employee employee) {
		Employee objEmployee = employeeRepository.save(employee);
		return objEmployee;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> employees = employeeRepository.findAll();
		return employees;
	}

	@Override
	public Employee getEmployeeById(long empId) {
		Employee employee = employeeRepository.findById(empId).get();
		return employee;
	}

	@Override
	public Employee updateEmployee(long empId, Employee employee) {
		Employee employeeObj = employeeRepository.findById(empId).get();
		employeeObj.setEmpName(employee.getEmpName());
		employeeObj.setDepartment(employee.getDepartment());
		employeeObj.setDesignation(employee.getDesignation());
		return employeeObj;
	}

}
