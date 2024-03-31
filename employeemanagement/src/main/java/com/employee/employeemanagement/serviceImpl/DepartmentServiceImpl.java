package com.employee.employeemanagement.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.employeemanagement.entity.Department;
import com.employee.employeemanagement.repository.DepartmentRepository;
import com.employee.employeemanagement.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Department createDepartment(Department dept) {
		Department deptObj = departmentRepository.save(dept);
		return deptObj;
	}

	@Override
	public List<Department> getAllDepartments() {
		List<Department> deptList = departmentRepository.findAll();
		return deptList;
	}

	@Override
	public Department getDepartmentById(long deptId) {
		Department department = departmentRepository.findById(deptId).get();
		return department;
	}

	@Override
	public Department updateDepartment(long deptId, Department department) {
		Department deptObj = departmentRepository.findById(deptId).get();
		deptObj.setDeptName(department.getDeptName());
		Department newDept = departmentRepository.save(deptObj);
		return newDept;
	}

	@Override
	public void deleteDepartment(long deptId) {
		departmentRepository.deleteById(deptId);
	}

}
