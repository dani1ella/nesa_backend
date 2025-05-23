package com.example.student_management_system.controller;

import com.example.student_management_system.dto.UserDTO;
import com.example.student_management_system.entity.User;
import com.example.student_management_system.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Register new user
    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody UserDTO userDTO) {
        // Check if the username already exists
        if (userService.findByUsername(userDTO.getUsername()) != null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Username is already taken!");
        }

        // Check if the email already exists
        if (userService.findByEmail(userDTO.getEmail()) != null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Email is already registered!");
        }

        // Convert UserDTO to User entity
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user.setRole(userDTO.getRole());
         // Store password as plain text (not recommended)

        // Save the new user
        userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body("User registered successfully!");
    }

    // Login user
    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody UserDTO userDTO) {
        User user = userService.findByUsername(userDTO.getUsername());
        if (user != null && userDTO.getPassword().equals(user.getPassword())) {
            return ResponseEntity.ok("Login successful!");
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password!");
    }

    // Get user by ID
    @GetMapping("/{id}")
    public ResponseEntity<String> getUserById(@PathVariable Long id) {
        Optional<User> user = userService.getUserById(id);
        return user.map(u -> ResponseEntity.ok("User found: " + u.getUsername())) // assuming you want to return the username
                   .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found"));
    }
}
