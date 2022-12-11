package com.question.practical.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.question.practical.manager.IGetEmployeeDetails;
import com.question.practical.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeDetailController {
	
	@Autowired
	IGetEmployeeDetails getEmployee;
	
	
	private static final Logger log = LoggerFactory.getLogger(EmployeeDetailController.class);

	
	@GetMapping("/getEmployeeDetails")
	public List<Employee> getEmployeeDetails() {
		log.info("Calling getEmployeeDetails controller.....");
		
	return getEmployee.getEmployeeDetails();
	}
	
	@GetMapping("/getEmployeeDetailsBasedOnId")
	public List<Employee> getEmployeeDetailsBasedOnID(@RequestParam Integer id) {
		log.info("Calling getEmployeeDetailsBasedOnID controller.....");
		
	return getEmployee.getEmployeeDetailsBasedOnId(id);
	}
}
