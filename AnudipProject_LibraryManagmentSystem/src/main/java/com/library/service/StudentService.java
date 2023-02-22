package com.library.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.library.entities.Student;

@Component
public interface StudentService {
	public Student createStudent(Student st); //post
	public Student getStudent(int id);      //get
	public List<Student> getAllStudents();  //get
	public String deleteStudent(int id);    //delete
	public String updateStudent(int id,Student st); //put

}


