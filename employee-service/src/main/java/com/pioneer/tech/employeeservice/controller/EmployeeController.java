package com.pioneer.tech.employeeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pioneer.tech.employeeservice.entity.Employee;
import com.pioneer.tech.employeeservice.entity.ResponseTemplateView;
import com.pioneer.tech.employeeservice.services.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/employees")
@Slf4j
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	
	@PostMapping("/")
	public Employee saveEmployee(@RequestBody Employee employee) {
		
		return employeeService.saveEmployee(employee);
	}
	
	@GetMapping("/{employeeId}")
	public ResponseTemplateView findEmployeeWithDepartment(@PathVariable("employeeId")  Long employeeId)
	{
		 log.info("Inside findEmployeeWithDepartment method of EmployeeController");
		return employeeService.findEmployeeWithDepartment(employeeId);
		
	}
}
