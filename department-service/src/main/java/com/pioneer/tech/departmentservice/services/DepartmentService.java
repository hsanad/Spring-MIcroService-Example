package com.pioneer.tech.departmentservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.pioneer.tech.departmentservice.entity.Department;
import com.pioneer.tech.departmentservice.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;


	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

	public Department findByDepartmentId(long departmentId) {
		// TODO Auto-generated method stub
		return departmentRepository.findByDepartmentId(departmentId);
	}

	public List<Department> findAllDepartment() {
		// TODO Auto-generated method stub
		return departmentRepository.findAll();
	}

	public void deleteByDepartmentId(Long departmentId) {
		// TODO Auto-generated method stub
		 departmentRepository.deleteById(departmentId); //deleteByDepartmentId(departmentId);
	}

}
