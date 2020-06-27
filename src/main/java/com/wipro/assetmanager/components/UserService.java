package com.wipro.assetmanager.components;

import java.util.Optional;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Service
public class UserService {

	@Autowired
	public User user;

	public User loginUser(User user) {
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
