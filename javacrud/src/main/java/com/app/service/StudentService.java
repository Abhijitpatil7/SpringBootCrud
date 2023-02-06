package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojo.Student;
import com.app.repositary.Studentinterface;



@Service
@Transactional
public class StudentService implements StudentInter {
	
	@Autowired
	private Studentinterface stud;

	@Override
	public List<Student> getAll() {
		
		return stud.findAll();
	}

	@Override
	public Student addStud(Student stud) {
		
		return null;
	}

	@Override
	public String deleteDetails(Long Id) {
		
		stud.deleteById(Id);
		return null;
	}
	//dep : dao layer i/f
	
	

}
