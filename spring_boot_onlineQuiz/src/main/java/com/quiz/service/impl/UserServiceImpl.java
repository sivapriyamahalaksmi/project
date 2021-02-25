package com.quiz.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



import com.quiz.exception.BusinessException;
import com.quiz.model.User;
import com.quiz.repository.UserRepository;
import com.quiz.service.UserService;

@Service

public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repo;

	@Override
	public User createUser(User user) {
		return repo.save(user);

	}

	@Override
	public String  validateUser(String uname, String pwd) throws BusinessException {
		
		String uname1,pwd1;
		uname1=uname;
		pwd1=pwd;
		
		 User un =new User(uname1,pwd1);
		 
//		 System.out.println("Printing sample password !!!!!!!");
//		 System.out.println(un.getPwd());
//		
		 User ux;
		 
		 ux=repo.findByUname(uname);
		 
//		 System.out.println("SAmpleprint!!!!!!!!!!!!!!!!!!");
//		 
//		System.out.println(ux);
		
		if(ux==null )
			throw new BusinessException("User name  "+uname+" not found");
		else {
			if(ux.getPwd().equalsIgnoreCase(pwd1)) {
			return "Logged in Successfully ";
				}
		else {
			throw new BusinessException("Password is incorrect");
			
		
		}
		}

		
	}

	@Override
	public List<User> getAllUsers() {
		
		return repo.findAll();
	}
	

	
}



