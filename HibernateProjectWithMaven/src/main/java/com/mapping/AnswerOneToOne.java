package com.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AnswerOneToOne {
	
	@Id
	@Column(name="answer_Id")
	int answerId;
	String answer;
	
	

}
