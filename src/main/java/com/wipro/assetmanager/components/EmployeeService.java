package com.wipro.assetmanager.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class EmployeeService {

	@Autowired
	public EmployeeRepository employeeRepository;

	public Employee addEmployee(Employee employee){
		Integer employeeID = employee.getId();
		if(employeeID!=null) {
			if(employeeRepository.findById(employeeID).isPresent()) 
			{ 
				return null;//ERROR: employee ALREADY EXISTS CAN'T SAVE
			}
		}
		return employeeRepository.save(employee);

	}

}
