package com.question.practical.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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

	// Fetch all employee details
	@GetMapping("/getEmployeeDetails")
	public List<Employee> getEmployeeDetails() {
		log.info("Calling getEmployeeDetails controller.....");
		
	return getEmployee.getEmployeeDetails();
	}
	
	
	// Fetch employee details based on id.....
	@GetMapping("/getEmployeeDetailsBasedOnId")
	public List<Employee> getEmployeeDetailsBasedOnID(@RequestParam Integer id) {
		log.info("Calling getEmployeeDetailsBasedOnID controller.....");
		
	return getEmployee.getEmployeeDetailsBasedOnId(id);
	}
	
	//Find who is having max salary in the list...
	@GetMapping("/getEmpWhoIsHavingMaxSalary")
	public List<Employee> getEmpWhoIsHavingMaxSalary(){
		log.info("Calling getEmpWhoIsHavingMaxSalary controller.....");
		return getEmployee.getEmpWhoIsHavingMaxSalary();
	}
	
	//Find department wise each employee who is having maximum salalry 
	@GetMapping("/getDepartmentWiseMaxSalary")
	public Map<String, Optional<Employee>>  getDepartmentWiseMaxSalary(){
		Map<String, Optional<Employee>> listEmp = new HashMap<>();
		listEmp = getEmployee.getDepartmentWiseMaxSalary();
		return listEmp;
	}
	
	//Find averageSalary of Female
	@GetMapping("/getAverageSalaryOfFemaleAndMale")
	public Map<String, Double> getAverageSalaryOfFemaleAndMale(){
		return getEmployee.getAverageSalaryOfFemaleAndMale();
	}
}
