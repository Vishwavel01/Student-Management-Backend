package com.example.StudentManagementSytem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentManagementSytem.service.StudentService;

import java.util.List;
import com.example.StudentManagementSytem.entity.Student;

@RestController
@RequestMapping("/StuManageSys")

public class StudentController {

	@Autowired
	StudentService studentService;
	
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	public StudentController() {
		super();
	}

	//RestAPI for Getting All Students Details
	@GetMapping("/students")
	public List<Student> getAllStudents(){ 
		return studentService.getAllStudents();

	}
	
	//RestAPI for a particular student details
	@GetMapping("/students/{rollNo}")
	public Student getStudent(@PathVariable int rollNo) {
		return studentService.getStudentById(rollNo);
	}
	
	//RestAPI to create new student record 
    @PostMapping("/student/add")
	public String createStudent(@RequestBody Student student) {
       studentService.createStudent(student);
       return "Created Succesfully";
	}
    
    @PutMapping("/student/update")
    public String updateStudent(@RequestBody Student student) {
    	studentService.updateStudent(student);
    	return "Updated Succesfully";
    }
    
    @DeleteMapping("/student/delete/{rollNo}")
    public String deleteStudent(@PathVariable int rollNo) {
    	studentService.deleteStudentById(rollNo);
    	return "Deleted Succesfully";
    	
    }
	
}