package com.epam.mentoring.PostsService.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.epam.mentoring.PostsService.model.web.request.CreatePostRequest;
import com.epam.mentoring.PostsService.model.web.request.UpdatePostRequest;
import com.epam.mentoring.PostsService.model.web.response.PostResponse;

@RequestMapping(value = "/posts", produces = MediaType.APPLICATION_JSON_VALUE)
public interface PostRestController {

    @PostMapping
    ResponseEntity<PostResponse> createPost (@RequestBody CreatePostRequest createPostRequest);
    @GetMapping
    ResponseEntity<PostResponse> getPost (@RequestParam(name = "id") Long id);
    @GetMapping("/hello")
    ResponseEntity<String> getHello ();
    @DeleteMapping
    ResponseEntity<Void> deletePost (@RequestParam(name = "id") Long id);
    @PutMapping
    ResponseEntity<PostResponse> updatePost (@RequestParam(name = "id") Long id, @RequestBody
    UpdatePostRequest userUpdateRequest);
}
