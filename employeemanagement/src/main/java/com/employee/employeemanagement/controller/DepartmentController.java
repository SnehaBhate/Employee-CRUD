package com.employee.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employeemanagement.entity.Department;
import com.employee.employeemanagement.service.DepartmentService;

@RestController
@RequestMapping("api/department")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/createDepartment")
	public ResponseEntity<Department> createDepartment(@RequestBody Department dept){
		System.out.println("Department Object"+ dept);
		Department deptObj = departmentService.createDepartment(dept);
		return new ResponseEntity<>(deptObj,HttpStatus.CREATED);
	}
	
	@GetMapping("/getDepartments")
	public ResponseEntity<List<Department>> getAllDepartments(){
		List<Department> deptList = departmentService.getAllDepartments();
		return ResponseEntity.ok(deptList);
	}
	
	@GetMapping("/getDepartmentById/{deptId}")
	public ResponseEntity<Department> getDepartmentById(@PathVariable("deptId") long deptId){
		Department department = departmentService.getDepartmentById( deptId);
		return ResponseEntity.ok(department);
	}
	
	@PutMapping("/UpdateDepartment/{deptId}")
	public ResponseEntity<Department> updateDepartment(@PathVariable("deptId") long deptId, @RequestBody Department department){	
		Department deptObj = departmentService.updateDepartment(deptId,department);
		return ResponseEntity.ok(deptObj);		
	}
	
	@DeleteMapping("/deleteDepartment/{deptId}")
	public String deleteDepartment(@PathVariable("deptId") long deptId) {
	return "Department deleted Successfully";
	}
}
