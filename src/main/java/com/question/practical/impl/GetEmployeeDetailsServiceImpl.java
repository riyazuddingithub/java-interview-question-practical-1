package com.question.practical.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.question.practical.manager.IGetEmployeeDetails;
import com.question.practical.model.Employee;

import ch.qos.logback.classic.Logger;
@Service
public class GetEmployeeDetailsServiceImpl implements IGetEmployeeDetails {

	
	private static final org.slf4j.Logger log = LoggerFactory.getLogger(GetEmployeeDetailsServiceImpl.class);

	
	List<Employee> list = Arrays.asList(
			new Employee(100, "Gourav", "Arya", "Male", "UP", "Banking", 120000),
			new Employee(101, "Baijnath", "Kushwaha", "Male", "Jharkhand", "IT", 100000),
			new Employee(102, "Aviral", "Kumar", "Male", "Kanpur", "IT", 60000),
			new Employee(103, "Deepak", "Kandaswamy", "Male", "Chainne", "IT", 130000),
			new Employee(104, "Pinki", "Sharma", "Female", "Uthrakhand", "MARKT", 90000),
			new Employee(105, "Neha", "Kumari", "Female", "Bihar", "MARKT", 40000),
			new Employee(106, "Chinki", "Kumari", "Female", "UP", "TEACHING", 14000));
	
	
	@Override
	public List<Employee> getEmployeeDetails() {
		log.info("inside service method......");
		List<Employee> empList = list.stream().collect(Collectors.toList());
	
		return empList;
	}
	
	public List<Employee> getEmployeeDetailsBasedOnId(Integer id) {
		List<Employee> getBasedOnId = list.stream().filter(s->s.getId().equals(id)).collect(Collectors.toList());
		return getBasedOnId;
	}
}
