package org.ywojctb.task.tracker.api.controllers.helpers;


import jakarta.transaction.Transactional;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;
import org.ywojctb.task.tracker.api.controllers.ProjectController;
import org.ywojctb.task.tracker.api.exceptions.NotFoundException;
import org.ywojctb.task.tracker.store.entities.ProjectEntity;
import org.ywojctb.task.tracker.store.repositories.ProjectRepository;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Component
@Transactional
public class ControllerHelper {

    ProjectRepository projectRepository;

    public ProjectEntity getProjectOrThrowException(Long projectId) {
        return projectRepository
                .findById(projectId)
                .orElseThrow(() -> new NotFoundException(
                        String.format(
                                "Project with \"%s\" doesn't exist. ",
                                projectId)));
    }
}
