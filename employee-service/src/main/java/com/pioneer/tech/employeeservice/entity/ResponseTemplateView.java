package com.pioneer.tech.employeeservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateView {

	private Employee employee ;
	private Department department;
	
}
