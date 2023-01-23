package com.epam.mentoring.PostsService.convertor;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.epam.mentoring.PostsService.model.Post;
import com.epam.mentoring.PostsService.model.web.request.CreatePostRequest;
import com.epam.mentoring.PostsService.model.web.request.UpdatePostRequest;
import com.epam.mentoring.PostsService.model.web.response.PostResponse;

@Mapper(componentModel = "spring")
public interface PostMapper {
    Post convert (CreatePostRequest createPostRequest);
    PostResponse convert (Post post);
    Post updatePost(UpdatePostRequest updatePostRequest, @MappingTarget Post post);
}
