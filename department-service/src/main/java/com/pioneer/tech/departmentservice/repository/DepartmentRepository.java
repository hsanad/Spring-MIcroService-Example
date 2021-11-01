package com.pioneer.tech.departmentservice.repository;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pioneer.tech.departmentservice.entity.Department;

@Repository
@Transactional
public interface DepartmentRepository extends JpaRepository<Department, Long> {

	
	Department findByDepartmentId(Long departmentId);
	
	Department deleteByDepartmentId(Long departmentId);
}
