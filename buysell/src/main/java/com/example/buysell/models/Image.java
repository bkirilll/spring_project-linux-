package com.example.buysell.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "images")
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "originalFileName")
    String originalFileName;

    @Column(name = "size")
    Long size;

    @Column(name = "contentType")
    String contentType;

    @Column(name = "isPreviewImage")
    boolean isPreviewImage;

    @Lob
    byte[] bytes;

    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    Product product;
}
