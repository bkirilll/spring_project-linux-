package org.ywojctb.task.tracker.api.factories;

import org.springframework.stereotype.Component;
import org.ywojctb.task.tracker.api.dto.TaskStateDto;
import org.ywojctb.task.tracker.store.entities.TaskStateEntity;

@Component
public class TaskStateDtoFactory {

    public TaskStateDto makeTaskStateDto(TaskStateEntity entity) {

        return TaskStateDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .createdAt(entity.getCreatedAt())
                .ordinal(entity.getOrdinal())
                .build();
    }
}
