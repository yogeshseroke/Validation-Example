package com.example.timepasscrud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class EntityExample {
    @Id
    private Long id;

    private String name;
}
