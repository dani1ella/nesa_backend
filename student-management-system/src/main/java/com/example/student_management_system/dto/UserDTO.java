package com.example.student_management_system.dto;

public class UserDTO {
    // private Long id;
    private String username;
    private String password;
    private String role;  // Role could be admin, headteacher, teacher, or student
    private String email; // Added email field

    // Getters and Setters
    // public Long getId() {
    //     return id;
    // }

    // public void setId(Long id) {
    //     this.id = id;
    // }

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

    public String getEmail() {
        return email;  // Getter for email
    }

    public void setEmail(String email) {
        this.email = email;  // Setter for email
    }
}
