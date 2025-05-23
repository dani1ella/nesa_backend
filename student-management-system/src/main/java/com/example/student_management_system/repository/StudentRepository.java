package com.example.student_management_system.repository;


import com.example.student_management_system.entity.Student;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // Custom query to find a student by name
    // Student findByName(String name);

    // Custom query to find students by their grade
    // List<Student> findByGrade(String grade);
}
