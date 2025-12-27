package com.example.StudentManagementSytem.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentManagementSytem.entity.Student;

public interface StudentRepositary extends JpaRepository<Student, Integer>{

}
