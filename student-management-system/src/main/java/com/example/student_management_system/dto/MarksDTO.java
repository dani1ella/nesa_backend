package com.example.student_management_system.dto;


public class MarksDTO {
    private Long id;
    private Long studentId;
    private Long courseId;
    private Integer marksObtained;  // Marks obtained by the student
    private String marksType;  // Could be "End of Unit" or "End of Term"
    
    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Integer getMarksObtained() {
        return marksObtained;
    }

    public void setMarksObtained(Integer marksObtained) {
        this.marksObtained = marksObtained;
    }

    public String getMarksType() {
        return marksType;
    }

    public void setMarksType(String marksType) {
        this.marksType = marksType;
    }
}

