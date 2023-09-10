package com.cascade;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CascadingQuestion {
	
	@Id
	private int question_id;
	private String question;
	 
	@OneToMany(mappedBy = "question",fetch = FetchType.LAZY, cascade = CascadeType.ALL  ) //mappedBy = "question" => means ab answer wali extra table ni banegi jo foregin key ka kaam kr rahi thi an "private CascadingQuestion question;" table ko join krega.
																						  // cascade = CascadeType.ALL => mens ab jo bhi tum operation perform kroge "save(),delete()" ka wo manually ni krna padega auto hoga 
	private List<CascadingAnswer> answers; //use List Because we store many of answers in this.

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

	public List<CascadingAnswer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<CascadingAnswer> answers) {
		this.answers = answers;
	}

	
}
