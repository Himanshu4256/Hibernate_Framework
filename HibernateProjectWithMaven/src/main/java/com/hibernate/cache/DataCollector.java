package com.hibernate.cache;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class DataCollector {
	@Id
	private int id;
	private String name;
	private String CompName;

}
