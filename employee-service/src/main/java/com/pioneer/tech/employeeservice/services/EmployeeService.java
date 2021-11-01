package com.pioneer.tech.employeeservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pioneer.tech.employeeservice.entity.Department;
import com.pioneer.tech.employeeservice.entity.Employee;
import com.pioneer.tech.employeeservice.entity.ResponseTemplateView;
import com.pioneer.tech.employeeservice.repository.EmployeeRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private RestTemplate restTemplate;
	public  Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	public ResponseTemplateView findEmployeeWithDepartment(Long employeeId) {
		// TODO Auto-generated method stub
		ResponseTemplateView view= new ResponseTemplateView();
		Employee emp = employeeRepository.findByEmployeeId(employeeId);
		 log.info("Inside findEmployeeWithDepartment method of EmployeeService");
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+emp.getDepartmentId(), Department.class);
		view.setEmployee(emp);
		view.setDepartment(department);
		return view;
	}
}
