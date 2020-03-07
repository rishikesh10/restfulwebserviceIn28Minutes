package com.boot.rest.restfulwebservices.model;

import java.time.LocalDate;

public class User {

	private Integer id;
	
	private String name;
	
	private LocalDate DOB;

	public User(Integer id, String name, LocalDate dOB) {
		super();
		this.id = id;
		this.name = name;
		DOB = dOB;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDOB() {
		return DOB;
	}

	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}
		
}
