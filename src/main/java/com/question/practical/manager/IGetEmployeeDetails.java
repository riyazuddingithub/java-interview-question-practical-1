package com.question.practical.manager;

import java.util.List;

import com.question.practical.model.Employee;

public interface IGetEmployeeDetails {

	 List<Employee> getEmployeeDetails();

	List<Employee> getEmployeeDetailsBasedOnId(Integer id);
}
