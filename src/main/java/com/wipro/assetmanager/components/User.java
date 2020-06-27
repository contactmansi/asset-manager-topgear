package com.wipro.assetmanager.components;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String username;
	
	private String passowrd;	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(String username, String passowrd) {
		super();
		this.id = id;
		this.username = username;
		this.passowrd = passowrd;
	}

	public Integer getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassowrd() {
		return passowrd;
	}


	public void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", passowrd=" + passowrd + "]";
	}


	
	
}
