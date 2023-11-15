package ru.ywojctb.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ywojctb.demo.models.Post;



public interface PostRepository extends JpaRepository<Post, Long> {


}
