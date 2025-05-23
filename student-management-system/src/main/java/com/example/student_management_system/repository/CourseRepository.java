package com.example.student_management_system.repository;


import com.example.student_management_system.entity.Course;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    // Custom query to find a course by its name
    Course findByCourseName(String courseName);

    // Custom query to find courses by their department
    List<Course> findByDepartment(String department);
}
