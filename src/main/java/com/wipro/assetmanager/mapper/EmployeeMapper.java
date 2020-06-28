package com.wipro.assetmanager.mapper;

import com.wipro.assetmanager.dto.EmployeeDto;
import com.wipro.assetmanager.model.Employee;

import java.time.Instant;

public class EmployeeMapper {
    public Employee mapDto(EmployeeDto employee) {
        Employee model = new Employee();
        model.setDesignation(employee.getDesignation());
        model.setLocation(employee.getLocation());
        model.setName(employee.getName());
        model.setNumber(employee.getNumber());
        model.setTime(Instant.now());

        return model;
    }
}
