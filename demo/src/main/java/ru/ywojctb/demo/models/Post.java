package ru.ywojctb.demo.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    String name;

    String anons;

    String fullText;

    int views;

    public Post(String name, String anons, String fullText) {
        this.name = name;
        this.anons = anons;
        this.fullText = fullText;
    }
}
