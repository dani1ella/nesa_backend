package com.example.student_management_system.controller;


import com.example.student_management_system.dto.MarksDTO;
import com.example.student_management_system.service.MarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/marks")
public class MarksController {

    @Autowired
    private MarksService marksService;

    @PostMapping("/add")
    public String addMarks(@RequestBody MarksDTO marksDTO) {
        return marksService.addMarks(marksDTO);
    }

    @GetMapping("/student/{studentId}")
    public MarksDTO getMarksByStudent(@PathVariable Long studentId) {
        return marksService.getMarksByStudent(studentId);
    }

    @PutMapping("/update/{marksId}")
    public String updateMarks(@PathVariable Long marksId, @RequestBody MarksDTO marksDTO) {
        return marksService.updateMarks(marksId, marksDTO);
    }
}
