package com.example.student_management_system.service;

import com.example.student_management_system.dto.CourseDTO;
import com.example.student_management_system.entity.Course;
import com.example.student_management_system.repository.CourseRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    // Get all courses
    public List<CourseDTO> getAllCourses() {
        return courseRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    // Get course by ID
    public CourseDTO getCourseById(Long id) {
        Optional<Course> courseOptional = courseRepository.findById(id);
        return courseOptional.map(this::convertToDTO).orElse(null);
    }

    // Add a new course
    public CourseDTO addCourse(CourseDTO courseDTO) {
        Course course = convertToEntity(courseDTO);
        Course savedCourse = courseRepository.save(course);
        return convertToDTO(savedCourse);
    }

    // Update an existing course
    public CourseDTO updateCourse(Long id, CourseDTO courseDTO) {
        Optional<Course> optionalCourse = courseRepository.findById(id);
        if (optionalCourse.isPresent()) {
            Course course = optionalCourse.get();
            course.setCourseName(courseDTO.getCourseName());
            course.setDepartment(courseDTO.getDepartment());
            Course updatedCourse = courseRepository.save(course);
            return convertToDTO(updatedCourse);
        }
        return null;
    }

    // Delete a course by ID
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }

    // Helper method: Convert Course entity to DTO
    private CourseDTO convertToDTO(Course course) {
        return new CourseDTO();
    }

    // Helper method: Convert DTO to Course entity
    private Course convertToEntity(CourseDTO courseDTO) {
        return new Course();
    }
}
