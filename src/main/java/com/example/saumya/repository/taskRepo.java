package com.example.saumya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.saumya.entity.Task;

@Repository 
public interface taskRepo extends JpaRepository<Task, String> {
    
    @Query("SELECT t FROM Task t WHERE t.taskId = ?1")
    Task findByTaskId(String taskId);
}
