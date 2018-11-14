package com.springbootstudent.project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springbootstudent.project.model.Student;

@Repository
public class StudentRepo {

	private List<Student> studentList = new ArrayList<>();

	public void loadStudents() {

		Student s1 = new Student(101, "Akshay", "CSE");
		Student s2 = new Student(102, "Barkha", "IT");
		Student s3 = new Student(103, "Chaman", "ECE");
		Student s4 = new Student(104, "Daman", "EI");
		Student s5 = new Student(105, "Aakash", "ME");
		Student s6 = new Student(106, "Aman", "CSE");
		Student s7 = new Student(107, "Baisakh", "IT");
		Student s8 = new Student(108, "Sachin", "CST");
		Student s9 = new Student(109, "Viru", "DST");
		Student s10 = new Student(110, "Dada", "BRT");
		Student s11 = new Student(111, "Zak", "LFB");
		Student s12 = new Student(112, "VVS", "ME");
		Student s13 = new Student(113, "Rahul", "ME");
		Student s14 = new Student(114, "Bhuvi", "ECE");
		Student s15 = new Student(115, "Virat", "EI");
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		studentList.add(s6);
		studentList.add(s7);
		studentList.add(s8);
		studentList.add(s9);
		studentList.add(s10);
		studentList.add(s11);
		studentList.add(s12);
		studentList.add(s13);
		studentList.add(s14);
		studentList.add(s15);

	}

	public List<Student> getAllStudents() {
		loadStudents();
		return studentList;
	}

	public Student getStudent(int rollNumber) {
		loadStudents();
		for (Student student : studentList) {
			if (student.getRollNo() == rollNumber) {
				return student;
			}
		}

		return null;
	}

	public Student addStudent(Student student) {
		loadStudents();
		Student newStudent = new Student(student.getRollNo(), student.getName(), student.getCourse());
		studentList.add(newStudent);
		return newStudent;
	}

	public Student updateStudent(Student student) {
		loadStudents();
		for (Student stu : studentList) {
			if (stu.getRollNo() == student.getRollNo()) {
				stu.setCourse(student.getCourse());
				stu.setName(student.getName());
				return stu;
			}
		}

		return null;
	}

	public boolean deleteStudent(Student student) {
		loadStudents();
		int index = -1;
		for (Student stu : studentList) {
			if (stu.getRollNo() == student.getRollNo()) {
				index = studentList.indexOf(stu);
				continue;
			}
		}

		if (index > -1) {
			studentList.remove(index);

		}
		return true;
	}

}
