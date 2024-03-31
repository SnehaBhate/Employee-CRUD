package com.employee.employeemanagement.service;

import java.util.List;

import com.employee.employeemanagement.entity.Department;


public interface DepartmentService {
	
	 Department createDepartment(Department dept);
	 List<Department> getAllDepartments();
	 Department getDepartmentById(long deptId);
	 Department updateDepartment(long deptId, Department department);
	 void deleteDepartment(long deptId);
	 

}
