package com.employee.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.employee.employeemanagement.entity.Employee;
import com.employee.employeemanagement.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/createEmployee")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
		System.out.println("controller"+employee);
		Employee ObjEmployee = employeeService.createEmployee(employee);
		return new ResponseEntity<>(ObjEmployee,HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllEmployees")
	public ResponseEntity<List<Employee>> getAllEmployee(){
		List<Employee> list = employeeService.getAllEmployee();
		return ResponseEntity.ok(list);	
	}
	
	@GetMapping("/getEmployeeById/{empId}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("empId") long empId){	
		Employee employee = employeeService.getEmployeeById(empId);
		return ResponseEntity.ok(employee);
	}
	
	@PutMapping("/updateEmployee/{empId}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("empId") long empId,@RequestBody Employee employee){
		Employee employeeObj = employeeService.updateEmployee(empId, employee);
		return ResponseEntity.ok(employeeObj);
	}
	

}
