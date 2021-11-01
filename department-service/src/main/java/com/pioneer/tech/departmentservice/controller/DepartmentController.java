package com.pioneer.tech.departmentservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pioneer.tech.departmentservice.entity.Department;
import com.pioneer.tech.departmentservice.services.DepartmentService;

import lombok.extern.slf4j.Slf4j;




@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department)
	{
		log.info("Inside saveDepartment method of DepartmentController");
		return departmentService.saveDepartment(department);
		
	}
	
	@GetMapping("/{departmentId}")
	public Department findDepartmentById(@PathVariable("departmentId") Long departmentId)
	{
		 log.info("Inside findDepartmentById method of DepartmentController");
		return departmentService.findByDepartmentId(departmentId);
	}
	
	@RequestMapping("/AllDepartment")
	public List<Department> findAllDepartment()
	{
		 log.info("Inside findDepartmentById method of DepartmentController");
		return departmentService.findAllDepartment();
	}
	
	@DeleteMapping("/{departmentId}")
	public String  deleteDepartmentById(@PathVariable("departmentId") Long departmentId)
	{
		 log.info("Inside findDepartmentById method of DepartmentController");
		 departmentService.deleteByDepartmentId(departmentId);
		 return "deleted" ;
	}
}
