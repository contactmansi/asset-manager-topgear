package com.wipro.assetmanager.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class EmployeeDto {

	private Integer id;

	private String Surname;

	private String name;

	private Integer number;

	private String Location;

	private String Designation;

	public EmployeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeDto(Integer id, String surname, String name, Integer number, String location, String designation) {
		super();
		this.id = id;
		Surname = surname;
		this.name = name;
		this.number = number;
		Location = location;
		Designation = designation;
	}

	public Integer getId() {
		return id;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", Surname=" + Surname + ", name=" + name + ", number=" + number + ", Location="
				+ Location + ", Designation=" + Designation + "]";
	}
	
	

}
