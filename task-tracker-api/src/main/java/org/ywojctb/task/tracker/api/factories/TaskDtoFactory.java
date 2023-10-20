package org.ywojctb.task.tracker.api.factories;

import org.springframework.stereotype.Component;
import org.ywojctb.task.tracker.api.dto.TaskDto;
import org.ywojctb.task.tracker.store.entities.TaskEntity;

@Component
public class TaskDtoFactory {

    public TaskDto makeTaskDto(TaskEntity entity) {

        return TaskDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .createdAt(entity.getCreatedAt())
                .description(entity.getDescription())
                .build();
    }
}
