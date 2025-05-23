package com.example.student_management_system.controller;


import com.example.student_management_system.dto.StudentDTO;
import com.example.student_management_system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/{id}")
    public StudentDTO getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @GetMapping("/class/{classId}")
    public List<StudentDTO> getStudentsByClass(@PathVariable Long classId) {
        return studentService.getStudentsByClass(classId);
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody StudentDTO studentDTO) {
        return studentService.addStudent(studentDTO);
    }
}
