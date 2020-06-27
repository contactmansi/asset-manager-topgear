package com.wipro.assetmanager.dto;

public class UserDto {

	private String username;
	
	private String passowrd;	
	
	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UserDto(String username, String passowrd) {
		super();
		this.username = username;
		this.passowrd = passowrd;
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

	
	
}
