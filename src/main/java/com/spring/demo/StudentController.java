package com.spring.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

	private Student student = new Student(1, "Siva", 22);

	@GetMapping
	public Student getStudent() {
		return student;
	}

	@PostMapping
	public Student createStudent(@RequestBody Student newStudent) {
		student = newStudent;
		return student;
	}

	@PutMapping
	public Student updateStudent(@RequestBody Student updatedStudent) {
		student = updatedStudent;
		return student;
	}

	@DeleteMapping
	public String deleteStudent() {
		student = null;
		return "Student Deleted";
	}
}
