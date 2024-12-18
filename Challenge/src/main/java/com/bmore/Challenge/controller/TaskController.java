package com.bmore.Challenge.controller;

import com.bmore.Challenge.entity.Task;
import com.bmore.Challenge.model.TaskDto;
import com.bmore.Challenge.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    ITaskService taskService;

    @GetMapping
    public ResponseEntity<List<Task>> getTasks(){
        return new ResponseEntity<>(taskService.getTasks(), HttpStatus.OK);
    }

    @PostMapping(value = "/store")
    public ResponseEntity<TaskDto> storeTask(@RequestBody TaskDto taskDto){
        return new ResponseEntity<>(taskService.storeTask(taskDto), HttpStatus.OK);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<TaskDto> updateTask(@RequestBody TaskDto taskDto){
        return new ResponseEntity<>(taskService.updateTask(taskDto), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteTask(@RequestParam Long taskId){
        taskService.deleteTask(taskId);
    }
}
