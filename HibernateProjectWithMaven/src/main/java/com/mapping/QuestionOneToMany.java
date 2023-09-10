package com.mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class QuestionOneToMany {
	
	@Id
	private int question_id;
	private String question;
	 
	@OneToMany(mappedBy = "question") // means ab answer wali extra table ni banegi jo foregin key ka kaam kr rahi thi an "private QuestionOneToMany question;" table ko join krega.
	private List<AnswerOneTOMany> answers; //use List Because we store many of answers in this.

	public int getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<AnswerOneTOMany> getAnswers() {
		return answers;
	}

	public void setAnswers(List<AnswerOneTOMany> answers) {
		this.answers = answers;
	}

	
	
	
	
//	public QuestionOneToMany(int question_id, String question, List<AnswerOneTOMany> answers) {
//		super();
//		this.question_id = question_id;
//		this.question = question;
//		this.answers = answers;
//	}
	
	
	
	
	
}
