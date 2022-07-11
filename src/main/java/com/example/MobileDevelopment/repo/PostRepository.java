package com.example.MobileDevelopment.repo;

import com.example.MobileDevelopment.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
