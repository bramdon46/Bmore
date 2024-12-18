package com.bmore.Challenge.model;

import com.bmore.Challenge.entity.Task;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaskDto {
    Long id;
    String title;
    String description;
    String state;

    public static TaskDto mapToDto(Task task){
        return TaskDto.builder()
                .id(task.getTaskId())
                .title(task.getTitle())
                .description(task.getDescription())
                .state(task.getState())
                .build();
    }

}
