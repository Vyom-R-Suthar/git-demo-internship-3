// Jai Swaminarayan KESHAV , Swami-Shreeji
package com.spring.jdbc.springjdbc.entities;

public class Student {
	
	private int id;
	private String name;
	private String city;
	private int courseId;
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Student(int id, String name, String city, int courseId) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.courseId = courseId;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", courseId=" + courseId + "]";
	}
	
}
