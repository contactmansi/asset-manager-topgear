package com.wipro.assetmanager.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	public EmployeeRepository employeeRepository;
	
	@Autowired
	public UserService service;
	
	@Autowired
	public EmployeeService employeeService;
	
	//Login
	@PostMapping("/login")
	public User login(@RequestBody User user) {
		return service.loginUser(user);
	}
	
	//Add Employee
	@PostMapping("/addemployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	

}
