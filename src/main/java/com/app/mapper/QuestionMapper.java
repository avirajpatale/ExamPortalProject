package com.app.mapper;

import java.util.ArrayList;

import com.app.Entity.QuestionType;
import com.app.Entity.Questions;
import com.app.dto.ChoiceResponsedto;
import com.app.dto.QuestionRequestdto;
import com.app.dto.QuestionResponsedto;

public class QuestionMapper {

	public static Questions mapQuestionDtoToQuestionEntity(QuestionRequestdto dto, Questions entity) {
		entity.setQuestion(dto.getQuestion());
		entity.setPoints(dto.getPoints());
		entity.setQuestionType(QuestionType.valueOf(dto.getQuestionType()));
		System.out.println("In Mapper method of Question");
		System.out.println(entity);
		return entity;
	}

	public static QuestionResponsedto mapQuestionEntityToQuestionResponseDto(Questions entity,
			QuestionResponsedto dto,ArrayList<ChoiceResponsedto> choicedto) {
		System.out.println("In mapQuestionEntityToQuestionResponseDto()");
		System.out.println(entity);
		dto.setQuestion(entity.getQuestion());
		dto.setQuestionId(entity.getQuestionId());
		dto.setPoints(entity.getPoints());
		dto.setChoices(choicedto);
		dto.setQuestionType(entity.getQuestionType().toString());
		System.out.println("Printing QuestionResponsedto");
		System.out.println(dto);
		return dto;
	}
}
