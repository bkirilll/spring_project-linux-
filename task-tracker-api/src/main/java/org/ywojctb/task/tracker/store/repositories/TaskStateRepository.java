package org.ywojctb.task.tracker.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ywojctb.task.tracker.store.entities.ProjectEntity;
import org.ywojctb.task.tracker.store.entities.TaskStateEntity;

import java.util.Optional;

public interface TaskStateRepository extends JpaRepository<TaskStateEntity, Long> {


    Optional<TaskStateEntity> findTaskStateEntityByProjectIdAndNameContainsIgnoreCase(Long projectId, String taskStateName);
}
