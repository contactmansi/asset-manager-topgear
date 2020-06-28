package com.wipro.assetmanager;

import com.wipro.assetmanager.dto.EmployeeDto;
import com.wipro.assetmanager.model.Employee;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class EmployeeMapper {
    public Employee mapDto(EmployeeDto employee) {
        Employee model = new Employee();
        model.setDesignation(employee.getDesignation());
        model.setLocation(employee.getLocation());
        model.setName(employee.getName());
        model.setNumber(employee.getNumber());
        model.setTime(Instant.now());
        model.setSurname(employee.getSurname());

        return model;
    }
}
