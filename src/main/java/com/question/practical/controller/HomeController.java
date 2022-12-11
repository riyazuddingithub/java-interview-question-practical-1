package com.question.practical.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.question.practical.manager.IGetEmployeeDetails;
import com.question.practical.model.Employee;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	
	private static final Logger log = LoggerFactory.getLogger(HomeController.class);

	
	@GetMapping("/homepage")
	public String home() {
		return "Home controller....";
	}
     
	
}
