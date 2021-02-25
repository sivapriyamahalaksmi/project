package com.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.model.Quiz;
import com.quiz.model.User;
import com.quiz.service.QuizService;

@RequestMapping("/")
@CrossOrigin
@RestController
public class QuizController {
	@Autowired
	private QuizService qs;

	@PostMapping("/addquiz")
	public Quiz createQuiz(@RequestBody Quiz quiz) {
				return qs.createQuiz(quiz);
	
	}
	
	@GetMapping("/quiz")
	public List<Quiz> getAllQuiz() {

		return qs.getAllQuiz();
	}
}
