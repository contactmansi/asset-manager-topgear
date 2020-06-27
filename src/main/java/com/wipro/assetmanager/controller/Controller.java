package com.wipro.assetmanager.controller;

import com.wipro.assetmanager.dto.EmployeeDto;
import com.wipro.assetmanager.service.EmployeeService;
import com.wipro.assetmanager.service.UserService;
import com.wipro.assetmanager.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	public UserService service;
	
	@Autowired
	public EmployeeService employeeService;
	
	//Login
	@PostMapping("/login")
	public ResponseEntity login(@RequestBody UserDto user) {
		 service.loginUser(user);
			return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}
	
	//Add Employee
	@PostMapping("/addemployee")
	public ResponseEntity addEmployee(@RequestBody EmployeeDto employee) {
		 employeeService.addEmployee(employee);
		 return new ResponseEntity<>(HttpStatus.CREATED);
	}
	

}
