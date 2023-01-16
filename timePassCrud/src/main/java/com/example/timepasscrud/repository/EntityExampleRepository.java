package com.example.timepasscrud.repository;

import com.example.timepasscrud.entity.EntityExample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityExampleRepository extends JpaRepository<EntityExample, Long> {
}
