package com.app.service;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestBody;

import com.app.Entity.Questions;
import com.app.Entity.QuestionsChoices;
import com.app.Entity.Student;
import com.app.dto.PaperResultdto;
import com.app.dto.StudentDetailsdto;

public interface IStudentService {

	public Student createStudentRecord(StudentDetailsdto dto, Student transientStudent);

	public String saveStudentsPaperResponse(@RequestBody PaperResultdto resultDto, Questions question,
			QuestionsChoices choice);
	
	public ArrayList<Student> fetchAllStudentsResults(Long paperId,ArrayList<Student> students);
}
