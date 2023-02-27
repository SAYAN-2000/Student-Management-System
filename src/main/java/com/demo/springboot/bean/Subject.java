package com.demo.springboot.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="subject1")
public class Subject {
	@Id
	private String id;
	private String name;
	
	public String getId() {
		return id;
	}
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subject(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + "]";
	}

}
