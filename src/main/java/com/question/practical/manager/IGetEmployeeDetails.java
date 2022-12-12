package com.question.practical.manager;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.question.practical.model.Employee;

public interface IGetEmployeeDetails {

	 List<Employee> getEmployeeDetails();

	List<Employee> getEmployeeDetailsBasedOnId(Integer id);

	List<Employee> getEmpWhoIsHavingMaxSalary();

	Map<String, Optional<Employee>> getDepartmentWiseMaxSalary();

	Map<String, Double> getAverageSalaryOfFemaleAndMale();
}
