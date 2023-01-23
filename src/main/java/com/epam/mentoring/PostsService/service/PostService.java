package com.epam.mentoring.PostsService.service;

import org.springframework.stereotype.Service;

import com.epam.mentoring.PostsService.feigneconfig.PostFeignClient;
import com.epam.mentoring.PostsService.model.Post;
import com.epam.mentoring.PostsService.model.web.request.feign.UserPostFgn;
import com.epam.mentoring.PostsService.repository.PostRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    private final PostFeignClient postFeignClient;

    public Post createPost(Post post) {
        postFeignClient.createPost(UserPostFgn.builder().authorId(post.getAuthorId()).build());
        return postRepository.save(post);
    }

    public Post getPostById(Long id) {
        return postRepository.findById(id).orElseThrow(() -> new RuntimeException("user not found"));
    }

    public void deletePostById(Long id) {
        Post postById = getPostById(id);
        postFeignClient.deletePost(new UserPostFgn(postById.getAuthorId()));
        postRepository.deleteById(id);
    }

    public Post savePost(Post post) {
      return   postRepository.save(post);
    }
}
