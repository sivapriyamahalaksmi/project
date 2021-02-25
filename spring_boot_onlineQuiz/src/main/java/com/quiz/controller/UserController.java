package com.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.quiz.exception.BusinessException;
import com.quiz.model.User;
import com.quiz.service.UserService;

@RequestMapping("/")
@CrossOrigin
@RestController
public class UserController {
	@Autowired
	private UserService us;

	@PostMapping("/adduser")
	public User createUser(@RequestBody User user) {
		
		return us.createUser(user);
	}
	
	@GetMapping("/Users")
	public List<User> getAllUsers() {

		return us.getAllUsers();
	}


	@GetMapping("/validateuser/{uname}/{pwd}")

	public String   validateUser(@PathVariable("uname") String uname, @PathVariable("pwd") String pwd) throws BusinessException {
		
		try {
			return us.validateUser(uname, pwd);
		} catch (BusinessException e) {
			return e.getMessage();
		}


	}
	
}

