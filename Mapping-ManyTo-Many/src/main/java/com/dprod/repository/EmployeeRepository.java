package com.dprod.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dprod.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	List<Employee> findAllByEmpId(Long empId);
	
}
