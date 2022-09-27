
package com.app.service;

import java.util.ArrayList;
import java.util.Optional;

import com.app.Entity.Questions;
import com.app.Entity.QuestionsChoices;
import com.app.dto.QuestionRequestdto;

public interface IQuestionsService {

	public String createQuestion(Questions transientQuestion,QuestionRequestdto questionDto,
			QuestionsChoices transientChoice);
	
	public Optional<Questions> fetchQuestion(Long id);
	
	public ArrayList<Questions> fetchAllQuestions(long paperId);
	
	
}
