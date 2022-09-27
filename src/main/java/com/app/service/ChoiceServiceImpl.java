package com.app.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Entity.QuestionsChoices;
import com.app.dao.ChoicesRepo;

@Service
public class ChoiceServiceImpl implements IChoicesService {

	@Autowired
	ChoicesRepo repo;
	
	@Override
	public ArrayList<QuestionsChoices> fetchChoices(Long questionId) {
		System.out.println("In fetchChoices()    "+questionId);
		ArrayList<QuestionsChoices> fetchChoices = repo.fetchChoices(questionId);
		System.out.println(fetchChoices);
		return fetchChoices;
	}

	@Override
	public QuestionsChoices insertChoice(QuestionsChoices transientChoice) {
		System.out.println("***************//////////////////////////////*************************");
		System.out.println("In Choice service");
		System.out.println("***************//////////////////////////////*************************");
		System.out.println(transientChoice);
		transientChoice.setChoiceId(null); 
		return  repo.save(transientChoice);
	}

	@Override
	public Optional<QuestionsChoices> fetchChoice(Long choiceId) {
		return repo.findById(choiceId);
	}

}
