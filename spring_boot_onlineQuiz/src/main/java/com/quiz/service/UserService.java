package com.quiz.service;



import java.util.List;

import com.quiz.exception.BusinessException;
import com.quiz.model.User;

public interface UserService {
	
	public User createUser(User user);
	public String validateUser(String uname,String pwd) throws BusinessException;
	public List<User> getAllUsers();

	


}
