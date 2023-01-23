package com.epam.mentoring.PostsService.model.web.request.feign;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.boot.jackson.JsonComponent;

@Data
@Builder
@JsonComponent
@AllArgsConstructor
@NoArgsConstructor
public class UserPostFgn {
    private Long authorId;
}
