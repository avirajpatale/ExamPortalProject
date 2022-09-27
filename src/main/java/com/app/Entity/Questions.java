package com.app.Entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "questions")
public class Questions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "question_id")
	private Long questionId;
	@Column(columnDefinition = "TEXT")
	private String question;
	private int points;
	@ManyToOne
	@JoinColumn(name="paper_id")
	private Paper paper;
	@Enumerated(EnumType.STRING)
	@Column(name="question_type",length =20)
	private QuestionType questionType;
	
	public Questions() {
		System.out.println("In Constructor of "+getClass().getName());
	}

    

	public Questions(Long questionId, String question, int points, Paper paper, QuestionType questionType) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.points = points;
		this.paper = paper;
		this.questionType = questionType;
	}



	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public Paper getPaper() {
		return paper;
	}

	public void setPaper(Paper paper) {
		this.paper = paper;
	}

	public QuestionType getQuestionType() {
		return questionType;
	}

	public void setQuestionType(QuestionType questionType) {
		this.questionType = questionType;
	}

	@Override
	public String toString() {
		return "Questions [questionId=" + questionId + ", question=" + question  
				+  ", points=" + points + ", questionType=" + questionType
				+ "]";
	}

		
}
