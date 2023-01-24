package com.epam.mentoring.PostsService.model.data;

import lombok.Data;

@Data
public class CreatePostData {

    private Long authorId;
    private String text;
    private String title;

}
