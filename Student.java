package com.example.demo;

public class Student {

	private int id;
	
	private String name , address ,course;
	
	private String dept;
	
	public Student()
	{
		
	}

	public Student(int id, String name, String address, String course, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.course = course;
		this.dept = dept;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}
