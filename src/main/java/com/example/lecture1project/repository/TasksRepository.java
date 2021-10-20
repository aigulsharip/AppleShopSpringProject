package com.example.lecture1project.repository;

import com.example.lecture1project.database.Service;

import java.util.List;

public interface TasksRepository {
    public List<Service> findTasks();
}
