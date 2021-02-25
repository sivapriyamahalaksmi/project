package com.quiz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.quiz.exception.BusinessException;
import com.quiz.model.Quiz;
import com.quiz.model.User;
import com.quiz.repository.QuizRepository;

import com.quiz.service.QuizService;

@Service

public class QuizServiceImpl implements QuizService {
	
	@Autowired
	private QuizRepository repq;

	@Override
	
	public Quiz createQuiz(Quiz quiz) {
//		Quiz qz=new Quiz("Which of the following option leads to the portability and security of Java?",
//				"Bytecode is executed by JVM",
//				"The applet makes the Java code secure and portable",
//				"Use of exception handling",
//				"Dynamic binding between objects",
//				"Bytecode is executed by JVM");
		return repq.save(quiz);
	}
	


	@Override
	public String validateQuiz(String qa, String aw1, String aw2, String aw3, String aw4)
			throws BusinessException {
		
//		String qa1,as1,as2,as3,as4,rs1;
//		
//		qa1=qa;
//		as1=aw1;
//		as2=aw2;
//		as3=aw3;
//		as4=aw4;
//			
//		
//		Quiz qz=new Quiz(qa1,as1,as2,as3,as4);
//		
//		Quiz qx;
//		
//		qx=repo.findByQuiz(qa1);
//		 
//		if(qx.	
//			throw new BusinessException("User name  "+uname+" not found");
//		else {
//			if(ux.getPwd().equalsIgnoreCase(pwd1)) {
//			return "Logged in Successfully ";
//				}
//		else {
//			throw new BusinessException("Password is incorrect");
		
		return null;
		}



	@Override
	public List<Quiz> getAllQuiz() {
		
		return repq.findAll();
	}
		
	}

