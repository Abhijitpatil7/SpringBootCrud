package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.Student;
import com.app.service.StudentService;



@RestController // @Controller + @ResponseBody
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private StudentService s;
	
	public StudentController() {
		System.out.println("in ctor of " + getClass());
	}

	// add REST end point to return list of students
	@GetMapping
	public List<Student> getAllStudents()
	{
		List<Student> students=s.getAll();
		System.out.println(""+students);
		return students;
	}
}

