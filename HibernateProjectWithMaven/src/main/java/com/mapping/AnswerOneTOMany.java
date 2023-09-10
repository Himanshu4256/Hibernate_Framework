package com.mapping;

//import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AnswerOneTOMany {	

	@Id
	private int answer_Id;
	private String answer;
	@ManyToOne
	private QuestionOneToMany question;
	
	public int getAnswer_Id() {
		return answer_Id;
	}

	public void setAnswer_Id(int answer_Id) {
		this.answer_Id = answer_Id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public QuestionOneToMany getQuestion() {
		return question;
	}

	public void setQuestion(QuestionOneToMany question) {
		this.question = question;
	}

	
	
	

}
