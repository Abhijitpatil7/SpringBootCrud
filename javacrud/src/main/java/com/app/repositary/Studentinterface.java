package com.app.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojo.Student;



public interface Studentinterface extends JpaRepository<Student, Long> {

}
