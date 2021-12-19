package com.studentsystem.studentsystem.service;

import com.studentsystem.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudent();
}
