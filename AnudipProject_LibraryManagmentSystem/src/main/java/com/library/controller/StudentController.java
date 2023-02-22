package com.library.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.library.entities.Student;
import com.library.service.StudentService;
import com.library.serviceimpl.StudentServiceImpl;

@RestController
public class StudentController {

	@Autowired(required = true)
	StudentService ss = new StudentServiceImpl();

	@PostMapping("/student")
	public ResponseEntity<Student> createStudent(@RequestBody Student st) {
		Student s = ss.createStudent(st);
		if (s != null)
			return new ResponseEntity<Student>(s, HttpStatus.CREATED);

		return new ResponseEntity<Student>(HttpStatus.BAD_REQUEST);
	}

	@GetMapping("/student/{bId}")
	public ResponseEntity<Student> getStudent(@PathVariable int bId) {
		try {
			Student s = ss.getStudent(bId);
			if (s != null)
				return new ResponseEntity<Student>(s, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
	}
	

	@GetMapping("/students")
	public ResponseEntity<List<Student>> getStudents() {
		try {
			List<Student> slist = ss.getAllStudents();
			if (slist != null)
				return new ResponseEntity<List<Student>>(slist, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<List<Student>>(HttpStatus.NOT_FOUND);

	}

	@PutMapping("/student/{bId}")
	public String updateName(@PathVariable("bId") int bId, @RequestBody Student st) {
		return ss.updateStudent(bId, st);
	}

	@DeleteMapping("/student/{bId}")
	public String deleteStudent(@PathVariable("bId") int bId) {
		return ss.deleteStudent(bId);

	}

}
