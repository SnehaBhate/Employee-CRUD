package com.employee.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.employeemanagement.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{


}
