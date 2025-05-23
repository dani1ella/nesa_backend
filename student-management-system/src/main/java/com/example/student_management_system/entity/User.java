package com.example.student_management_system.entity;


import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String role; // Can be admin, headteacher, teacher, student
    
    @Column(nullable = false, unique = true)  // Ensure email is unique
    private String email;  // Adding the email field

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private Set<Student> students = new HashSet<>(); // One user can be associated with multiple students (for headteachers, for example)

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {  // Getter for email
        return email;
    }

    public void setEmail(String email) {  // Setter for email
        this.email = email;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
