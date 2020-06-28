package com.wipro.assetmanager.service;

import com.wipro.assetmanager.dto.UserDto;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@Service
public class UserService {

	public void loginUser(UserDto user) {
		System.out.println("----------Inside loginUser function block-------");
		try {
			if(user != null) {
				System.out.println("----------Check for username and password-------");
				if(user.getUsername().equalsIgnoreCase("admin") && user.getPassword().equalsIgnoreCase("admin")) {
					System.out.println("----------Redirection to homepage-------");
				}
				else {
					throw new Exception("Invalid Username or Password");
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
}
