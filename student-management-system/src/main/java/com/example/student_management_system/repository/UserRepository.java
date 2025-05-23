package com.example.student_management_system.repository;

import com.example.student_management_system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Custom query to find a user by email
    User findByEmail(String email);

    // Custom query to find a user by username
    User findByUsername(String username);
}
