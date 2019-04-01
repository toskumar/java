package com.example.service;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {

	private Long id;

	private String name;

	private Department department;

	public Employee() {
		super();
	}
	public Employee(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
