package com.springbootstudent.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootstudent.project.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepo repo;

	@Override
	public List<Student> getAllStudents() {
		return repo.getAllStudents();
	}

	@Override
	public Student getStudent(int rollNumber) {
		if (!(rollNumber <= 0)) {
			return repo.getStudent(rollNumber);
		}

		return null;
	}

	@Override
	public Student addStudent(Student student) {
		if (student != null) {
			return repo.addStudent(student);
		}
		return null;
	}

	@Override
	public Student updateStudent(Student student) {
		if (student != null) {
			return repo.updateStudent(student);
		}
		return null;
	}

	@Override
	public boolean deleteStudent(Student student) {
		if (student != null) {
			return repo.deleteStudent(student);
		}
		return false;
	}

}
