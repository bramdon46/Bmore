package com.bmore.Challenge.service.impl;

import com.bmore.Challenge.entity.Task;
import com.bmore.Challenge.model.TaskDto;
import com.bmore.Challenge.repository.ITaskRepository;
import com.bmore.Challenge.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements ITaskService {

    @Autowired
    ITaskRepository taskRepository;


    @Override
    public TaskDto storeTask(TaskDto taskDto) {
        Task task = new Task();
        task.setTitle(taskDto.getTitle());
        task.setDescription(taskDto.getDescription());
        task.setState(taskDto.getState());
        return TaskDto.mapToDto(taskRepository.save(task));
    }

    @Override
    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

    @Override
    public TaskDto updateTask(TaskDto taskDto) {
        Task task = taskRepository.findById(taskDto.getId()).get();
        task.setTitle(taskDto.getTitle());
        task.setDescription(taskDto.getDescription());
        task.setState(taskDto.getState());
        return TaskDto.mapToDto(taskRepository.save(task));
    }

    @Override
    public void deleteTask(Long taskId) {
        taskRepository.deleteById(taskId);
    }
}
