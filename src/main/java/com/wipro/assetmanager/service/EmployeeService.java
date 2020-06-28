package com.wipro.assetmanager.service;

import com.wipro.assetmanager.dto.EmployeeDto;
import com.wipro.assetmanager.mapper.EmployeeMapper;
import com.wipro.assetmanager.model.Employee;
import com.wipro.assetmanager.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class EmployeeService {

	@Autowired
	public EmployeeMapper employeeMapper;

	@Autowired
	public EmployeeRepository employeeRepository;

	public Employee addEmployee(EmployeeDto employee){
		Integer employeeID = employee.getId();
		//map employeeDto to Employee class
		if(employeeID!=null) {
			if(employeeRepository.findById(employeeID).isPresent()) 
			{ 
				return null;//ERROR: employee ALREADY EXISTS CAN'T SAVE
			}
		}

		Employee model = employeeMapper.mapDto(employee);
		return employeeRepository.save(model);

	}

}
