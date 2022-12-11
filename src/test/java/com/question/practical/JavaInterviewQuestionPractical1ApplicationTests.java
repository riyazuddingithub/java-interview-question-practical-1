package com.question.practical;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import com.question.practical.impl.GetEmployeeDetailsServiceImpl;
import com.question.practical.model.Employee;

@SpringBootTest
class JavaInterviewQuestionPractical1ApplicationTests {

	@InjectMocks
	public GetEmployeeDetailsServiceImpl getEmployeeDetailsServiceImpl;
	
	private static final Logger log = LoggerFactory.getLogger(JavaInterviewQuestionPractical1ApplicationTests.class);


	@Test
	@Order(1)
	public void getEmployeeDetails() {
		log.info("Before getEmployeeDetails junit test case.......");
		List<Employee> list = Arrays.asList(
				new Employee(100, "Gourav", "Arya", "Male", "UP", "Banking", 120000),
				new Employee(101, "Baijnath", "Kushwaha", "Male", "Jharkhand", "IT", 100000),
				new Employee(102, "Aviral", "Kumar", "Male", "Kanpur", "IT", 60000),
				new Employee(103, "Deepak", "Kandaswamy", "Male", "Chainne", "IT", 130000),
				new Employee(104, "Pinki", "Sharma", "Female", "Uthrakhand", "MARKT", 90000),
				new Employee(105, "Neha", "Kumari", "Female", "Bihar", "MARKT", 40000),
				new Employee(106, "Chinki", "Kumari", "Female", "UP", "TEACHING", 14000));
		
		assertEquals(list.size(), getEmployeeDetailsServiceImpl.getEmployeeDetails().size());
		log.info("After getEmployeeDetails junit test case....");
	}

}
