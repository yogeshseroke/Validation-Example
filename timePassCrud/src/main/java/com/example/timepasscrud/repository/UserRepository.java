package com.example.timepasscrud.repository;

import com.example.timepasscrud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
