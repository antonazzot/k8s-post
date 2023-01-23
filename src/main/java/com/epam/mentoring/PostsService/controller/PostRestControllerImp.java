package com.epam.mentoring.PostsService.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.epam.mentoring.PostsService.convertor.PostMapper;
import com.epam.mentoring.PostsService.model.web.request.CreatePostRequest;
import com.epam.mentoring.PostsService.model.web.request.UpdatePostRequest;
import com.epam.mentoring.PostsService.model.web.response.PostResponse;
import com.epam.mentoring.PostsService.service.PostService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class PostRestControllerImp implements PostRestController{

    private final PostService postService;
    private final PostMapper postMapper;

    @Override
    public ResponseEntity<PostResponse> createPost(CreatePostRequest createPostRequest) {
        var post = postMapper.convert(createPostRequest);
        var persistPost = postService.createPost(post);
        var postResponse = postMapper.convert(persistPost);
        return ResponseEntity.ok(postResponse);
    }

    @Override
    public ResponseEntity<PostResponse> getPost(Long id) {
        var postResponse = postMapper.convert(postService.getPostById(id));
        return ResponseEntity.ok(postResponse);
    }

    @Override
    public ResponseEntity<String> getHello() {
        return ResponseEntity.ok("Hello moto");
    }

    @Override
    public ResponseEntity<Void> deletePost(Long id) {
        postService.deletePostById(id);
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<PostResponse> updatePost(Long id, UpdatePostRequest updatePostRequest) {
        var post = postService.getPostById(id);
        var updatedPost = postMapper.updatePost(updatePostRequest, post);
        return ResponseEntity.ok(postMapper.convert(postService.savePost(updatedPost)));
    }
}
