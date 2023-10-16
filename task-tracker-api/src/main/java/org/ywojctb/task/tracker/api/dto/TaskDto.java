package org.ywojctb.task.tracker.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskDto {

    Long id;

    String name;

    @JsonProperty("created_at")
    Instant createdAt;

    String description;
}
