package com.tcs.springmvcorm;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeT {
	
	@Id
	private int id;
	private String name;
	public EmployeeT() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
