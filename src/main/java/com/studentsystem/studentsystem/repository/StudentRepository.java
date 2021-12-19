package com.studentsystem.studentsystem.repository;

import com.studentsystem.studentsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    // We write Integer because our primary key in the Student model is ID (Integer)
    // We do database operation in this interface
}
