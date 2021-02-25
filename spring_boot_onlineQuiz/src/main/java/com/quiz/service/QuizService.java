package com.quiz.service;

import java.util.List;

import com.quiz.exception.BusinessException;
import com.quiz.model.Quiz;
import com.quiz.model.User;

public interface QuizService {
	
	public Quiz createQuiz(Quiz quiz);
	public String validateQuiz(String qa,String aw1,String aw2,String aw3,String aw4) throws BusinessException;
	public List<Quiz> getAllQuiz();
	
	

}
