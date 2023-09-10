package com.cascade;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CascadingAnswer {	

	@Id
	private int answer_Id;
	private String answer;
	@ManyToOne
	private CascadingQuestion question;
	
	public CascadingAnswer(int answer_Id, String answer) {
		super();
		this.answer_Id = answer_Id;
		this.answer = answer;
	}



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

	public CascadingQuestion getQuestion() {
		return question;
	}

	public void setQuestion(CascadingQuestion question) {
		this.question = question;
	}

	
	
	

}
