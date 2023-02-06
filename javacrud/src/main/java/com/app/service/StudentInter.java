package com.app.service;

import java.util.List;

import com.app.pojo.Student;



public interface StudentInter {
//get all emps
	List<Student> getAll();

	Student addStud(Student stud);

	

	String deleteDetails(Long Id);
}
