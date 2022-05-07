package com.edureka.HasARelation;

public class StudentInfo {
	int id;
	Student name;
	public StudentInfo(int id, Student name) {
		this.id=id;
		this.name=name;
	}
	
	public void show() {
		System.out.println("Student ID is " + id);
		System.out.println("Student name is " + name.firstName+" "+name.lastName);
	}
}
