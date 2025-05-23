package com.example.student_management_system.dto;

public class CourseDTO {
    private Long id;
    private String courseName;
    private String description;
    private Integer maxMarks;  // Maximum marks for the course
    private String department; // New field for department

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getMaxMarks() {
        return maxMarks;
    }

    public void setMaxMarks(Integer maxMarks) {
        this.maxMarks = maxMarks;
    }

    public String getDepartment() {  // Getter for department
        return department;
    }

    public void setDepartment(String department) {  // Setter for department
        this.department = department;
    }
}
