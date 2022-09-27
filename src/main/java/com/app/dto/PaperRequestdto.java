package com.app.dto;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PaperRequestdto {

	@NotBlank(message = "Paper's name is required")
	@Size(max=30,message = "Paper name should not exceed beyond 20 characters")
	private String paperName;
	@NotBlank(message = "Paper's subject name is required")
	@Size(max=25,message = "Paper name should not exceed beyond 20 characters")
	private String paperSubject;
	private Long paperSetterId;
	private boolean reviewed;
	@Size(max=10,message = "Max password length is 10 characters")
	private String paperPassword;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDateTime startDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")	
	private LocalDateTime endDate;
	private LocalTime duration;
	@NotBlank(message="Please provide difficulty level of paper")
	@Size(max=10,message = "Max password length is 10 characters")
	private String difficultyLevel;
	private int totalMarks;
	private int totalQuestions;
	
	public PaperRequestdto() {
		System.out.println("In Constructor of "+getClass().getName());
	}

	public String getPaperName() {
		return paperName;
	}

	public void setPaperName(String paperName) {
		this.paperName = paperName;
	}

	public String getPaperSubject() {
		return paperSubject;
	}

	public void setPaperSubject(String paperSubject) {
		this.paperSubject = paperSubject;
	}

	public boolean isReviewed() {
		return reviewed;
	}

	public void setReviewed(boolean reviewed) {
		this.reviewed = reviewed;
	}

	public String getPaperPassword() {
		return paperPassword;
	}

	public void setPaperPassword(String paperPassword) {
		this.paperPassword = paperPassword;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public LocalTime getDuration() {
		return duration;
	}

	public void setDuration(LocalTime duration) {
		this.duration = duration;
	}

	public Long getPaperSetterId() {
		return paperSetterId;
	}

	public void setPaperSetterId(Long paperSetterId) {
		this.paperSetterId = paperSetterId;
	}

	public String getDifficultyLevel() {
		return difficultyLevel;
	}

	public void setDifficultyLevel(String difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public int getTotalQuestions() {
		return totalQuestions;
	}

	public void setTotalQuestions(int totalQuestions) {
		this.totalQuestions = totalQuestions;
	}

	@Override
	public String toString() {
		return "PaperRequestdto [paperName=" + paperName + ", paperSubject=" + paperSubject + ", paperSetterId="
				+ paperSetterId + ", reviewed=" + reviewed + ", paperPassword=" + paperPassword + ", startDate="
				+ startDate + ", endDate=" + endDate + ", duration=" + duration + ", difficultyLevel=" + difficultyLevel
				+ ", totalMarks=" + totalMarks + ", totalQuestions=" + totalQuestions + "]";
	}

}
