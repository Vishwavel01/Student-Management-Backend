package com.example.StudentManagementSytem.service;

import java.util.List;

import com.example.StudentManagementSytem.entity.Student;

public interface StudentService {
	
	public List<Student> getAllStudents();
	
	public Student getStudentById(int rollNo);
	
	public String createStudent(Student student);
	
	public String updateStudent(Student student);
	
	public String deleteStudentById(int rollNo);

	public void deleteAllStudent();
}
