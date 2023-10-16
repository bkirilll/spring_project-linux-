package org.ywojctb.task.tracker.api.factories;

import org.springframework.stereotype.Component;
import org.ywojctb.task.tracker.api.dto.TaskDto;
import org.ywojctb.task.tracker.api.dto.TaskStateDto;

@Component
public class TaskDtoFactory {

    public TaskDto makeTaskDto(TaskDto entity) {

        return TaskDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .createdAt(entity.getCreatedAt())
                .description(entity.getDescription())
                .build();
    }
}
