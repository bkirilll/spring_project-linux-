package org.ywojctb.task.tracker.api.factories;

import org.springframework.stereotype.Component;
import org.ywojctb.task.tracker.api.dto.ProjectDto;
import org.ywojctb.task.tracker.store.entities.ProjectEntity;

@Component
public class ProjectDtoFactory {

    public ProjectDto makeProjectDto(ProjectEntity entity) {

        return ProjectDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .createdAt(entity.getCreatedAt())
                .build();
    }
}
