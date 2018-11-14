package com.springbootstudent.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootstudent.project.model.Student;

@RestController
@EnableAutoConfiguration
public class StudentController {

	@Autowired
	StudentService service;
	
	@GetMapping("/start")
	public String start() {
		return "Start";
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return service.getAllStudents();
	}
	
	@GetMapping("/students/{rollNUmber}")
	public Student getStudent(@PathVariable("rollNUmber") int rollNumber) {
		return service.getStudent(rollNumber);
	}
	
	@PostMapping("/students/student")
	public Student addStudent(@RequestBody Student student) {
		return service.addStudent(student);
	}
	
	@PutMapping("/students/update")
	public Student updateStudent(@RequestBody Student student) {
		return service.updateStudent(student);
	}
	
	@DeleteMapping("/students/delete")
	public boolean deleteStudent(@RequestBody Student student) {
		return service.deleteStudent(student);
	}
	
	
}
