package com.wipro.assetmanager.model;

import com.wipro.assetmanager.dto.UserDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Instant;


@Entity
public class Employee {
	
	@Id
	private Integer id;
	
	private String surname;
	
	private String name;
	
	private Integer number;
	
	private String location;
	
	private String designation;
	
	private Instant time;

	public Instant getTime() {
		return time;
	}

	public void setTime(Instant time) {
		this.time = time;
	}



	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer id, String surname, String name, Integer number, String location, String designation) {
		super();
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.number = number;
		this.location = location;
		this.designation = designation;
	}

	
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
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
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", surname=" + surname + ", name=" + name + ", number=" + number + ", location="
				+ location + ", Designation=" + designation + "]";
	}
	
	

}
