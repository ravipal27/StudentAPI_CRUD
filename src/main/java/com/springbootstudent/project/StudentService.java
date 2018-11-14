package com.springbootstudent.project;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springbootstudent.project.model.Student;

@Service
public interface StudentService {

	public List<Student> getAllStudents();
	public Student getStudent(int rollNumber);
	public Student addStudent(Student student);
	public Student updateStudent(Student student);
	public boolean deleteStudent(Student student);
}

