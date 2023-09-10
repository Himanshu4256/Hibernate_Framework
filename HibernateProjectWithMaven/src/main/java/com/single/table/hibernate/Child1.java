package com.single.table.hibernate;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;

import lombok.Data;

@Data
public class Child1 extends Parent{
	@Column(name="salary",columnDefinition = "DECIMAL(7,2)")
	private Double salary;
	
	@Column(name="date_of_joining")
	private LocalDate doj;
	
	private String deptName;
	
	@Column(name="bonus",precision = 6, scale = 3)
	private BigDecimal bonus;
	
	@Column(name="email",length=30,unique = true)
	private String email;
	
	
	
	
}
