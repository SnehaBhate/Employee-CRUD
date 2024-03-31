package com.employee.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.employeemanagement.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
