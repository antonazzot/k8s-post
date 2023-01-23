package com.epam.mentoring.PostsService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epam.mentoring.PostsService.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}
