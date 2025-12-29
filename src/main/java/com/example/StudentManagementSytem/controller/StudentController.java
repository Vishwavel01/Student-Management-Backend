package com.example.StudentManagementSytem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentManagementSytem.service.StudentService;

import java.util.Collections;
import java.util.List;
import java.util.Map;

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
	
	@PostMapping("/student/add")
	public ResponseEntity<Map<String, String>> createStudent(@RequestBody Student student) {
	    studentService.createStudent(student);
	    // Returns: { "message": "Created Successfully" }
	    return ResponseEntity.ok(Collections.singletonMap("message", "Created Successfully"));
	}

	// 2. UPDATE: Return JSON instead of String
	@PutMapping("/student/update")
	public ResponseEntity<Map<String, String>> updateStudent(@RequestBody Student student) {
	    studentService.updateStudent(student);
	    // Returns: { "message": "Updated Successfully" }
	    return ResponseEntity.ok(Collections.singletonMap("message", "Updated Successfully"));
	}

	// 3. DELETE: Return JSON instead of String
	@DeleteMapping("/student/delete/{rollNo}")
	public ResponseEntity<Map<String, String>> deleteStudent(@PathVariable int rollNo) {
	    studentService.deleteStudentById(rollNo);
	    // Returns: { "message": "Deleted Successfully" }
	    return ResponseEntity.ok(Collections.singletonMap("message", "Deleted Successfully"));
	}

	// 4. DELETE ALL: Return JSON instead of String
	@DeleteMapping("delete-all")
	public ResponseEntity<Map<String, String>> deleteAllStudent() {
	    studentService.deleteAllStudent();
	    // Returns: { "message": "Deleted All records" }
	    return ResponseEntity.ok(Collections.singletonMap("message", "Deleted All records"));
	}
	
}