package com.epam.mentoring.PostsService.model.web.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostResponse {
    private Long id;
    private Long authorId;
    private String text;
    private String title;
    private Instant postedAt;
}
