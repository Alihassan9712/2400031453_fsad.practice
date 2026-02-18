package com.klu.demo.model;

public class Student {
	private int id;
	private String name;
	private String course;
	
	public Student() {
		
	}
	
	public Student(int id, String name, String course) {
				this.id=id;
				this.name=name;
				this.course=course;
	}
	
	public int getid() {
	    return id;
	}

	public void setid(int id) {
	    this.id = id;
	}

	public String getname() {
	    return name;
	}

	public void setname(String name) {
	    this.name = name;
	}

	public String getcourse() {
	    return course;
	}

	public void setcourse(String course) {
	    this.course = course;
	}

}
