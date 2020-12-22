package com.example.demo.service.impl;

import com.example.demo.Mapper.TaskMapper;
import com.example.demo.model.Task;
import com.example.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    TaskMapper taskMapper;
    @Override
    public List<Task> showList() {
        return taskMapper.list();
    }

    @Override
    public Integer addTask(Task task) {
        return taskMapper.addTask(task);
    }
}
