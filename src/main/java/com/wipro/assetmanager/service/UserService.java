package com.wipro.assetmanager.service;

import com.wipro.assetmanager.dto.UserDto;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Service
public class UserService {

	public UserDto loginUser(UserDto user) {
		try {

			if(user != null) {
				if(user.getUsername().equalsIgnoreCase("admin") && user.getPassowrd().equalsIgnoreCase("admin")) {
					return user;// Redirection to homepage
				}
			}
		}
		catch(Exception e) {
			throw e; //ERROR: “Invalid Username or Password”
		}
		return null;
	}
	
	

}
