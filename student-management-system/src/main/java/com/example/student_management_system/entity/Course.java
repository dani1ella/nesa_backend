package com.example.student_management_system.entity;


import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String courseName;

    private String description;

    @Column(nullable = false)
    private Integer maxMarks;

    @Column(nullable = false)  // Add this to ensure department is required
    private String department; // ✅ New field added

    @OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
    private Set<Marks> marks = new HashSet<>(); // A course can have many marks entries

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

    public String getDepartment() { // ✅ New getter method
        return department;
    }

    public void setDepartment(String department) { // ✅ New setter method
        this.department = department;
    }

    public Set<Marks> getMarks() {
        return marks;
    }

    public void setMarks(Set<Marks> marks) {
        this.marks = marks;
    }
}
