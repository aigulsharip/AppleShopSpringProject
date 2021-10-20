package com.example.lecture1project.repository;
import com.example.lecture1project.database.Service;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// As we have only one implementation of TasksRepository, we don't need @Primary

@Repository
public class TasksRepositoryImplSortTaskAlphabet implements TasksRepository{
    @Override
    public List<Service> findTasks() {
        return Service.getTasks().stream().sorted(Comparator.comparing(Service::getTask)).collect(Collectors.toList());
    }
}
