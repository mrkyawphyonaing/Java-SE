package com.edureka.HasARelation;

public class HasDemo {

	public static void main(String[] args) {
		Student student = new Student("Kham", "Li");
		StudentInfo studentinfo = new StudentInfo(1, student);
		studentinfo.show();

	}

}
