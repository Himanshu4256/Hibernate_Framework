package com.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class QuestionOneToOne {
	
	@Id
	@Column(name = "question_id")
	int questionId;
	String question;
	
	@OneToOne // represent foreign key
	@JoinColumn(name="a_Id")    // sirf colom name change krega
	AnswerOneToOne answerOneToOne;
	
	
	
	
	public AnswerOneToOne getAnswer() {
		return answerOneToOne;
	}
	public void setAnswer(AnswerOneToOne answerOneToOne) {
		this.answerOneToOne = answerOneToOne;
	}

}
