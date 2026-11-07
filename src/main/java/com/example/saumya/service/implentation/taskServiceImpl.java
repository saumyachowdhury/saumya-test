package com.example.saumya.service.implentation;

import java.util.*;

import org.springframework.stereotype.Service;

import com.example.saumya.service.taskService;


@Service
public class taskServiceImpl implements taskService{
    
    @Override 
    public List<String> getTasks() throws Exception {
        return Arrays.asList("Task 1", "Task 2", "Task 3");
    }
}
