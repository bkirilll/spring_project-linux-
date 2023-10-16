package org.ywojctb.task.tracker.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ywojctb.task.tracker.store.entities.ProjectEntity;
import org.ywojctb.task.tracker.store.entities.TaskEntity;

public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
}
