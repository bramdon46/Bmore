package com.bmore.Challenge.service;

import com.bmore.Challenge.entity.Task;
import com.bmore.Challenge.model.TaskDto;

import java.util.List;

public interface ITaskService {

    TaskDto storeTask(TaskDto taskDto);

    List<Task> getTasks();

    TaskDto updateTask(TaskDto taskDto);

    void deleteTask(Long taskId);
}
