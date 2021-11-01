package com.pioneer.tech.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pioneer.tech.employeeservice.entity.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long>{

	Employee findByEmployeeId(Long employeeId);

	
}
