package com.example.saumya.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.*;


@Entity 
public class Task {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long taskId;

    @Column(name = "task_name", nullable = false)
    private String taskName;

    @Column (name = "task_description", nullable = false)
    private String taskDescription;

    

}
