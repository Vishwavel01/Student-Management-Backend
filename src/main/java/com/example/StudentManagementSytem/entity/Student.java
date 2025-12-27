package com.example.StudentManagementSytem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollNo;
	
	@Column(name = "student_FirstName")
	private String firstName;
	
	@Column(name = "student_LastName")
	private String lastName;
	
	@Column(name = "student_PhoneNo")
	private String phoneNo;
	
	@Column(name = "student_Email")
	private String email;
	
	@Column(name = "student_Department")
	private String department;
	

	//Constructor from Superclass
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Constructor using fields
	
	public Student(String firstName, String lastName, String phoneNo, String email, String department) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.email = email;
		this.department = department;
	}
	
	//Getter and Setter Methods using fields
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
