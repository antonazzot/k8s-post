package com.epam.mentoring.PostsService.feigneconfig;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.epam.mentoring.PostsService.model.web.request.feign.UserPostFgn;
//"http://localhost:7777/"
@FeignClient(value = "postfeign", url = "${feign.url}")
public interface PostFeignClient {
    @RequestMapping(method = RequestMethod.POST, value = "/users/createpost")
    void createPost(@RequestBody UserPostFgn userPostFgn);
    @RequestMapping(method = RequestMethod.POST, value = "/users/deletepost")
    void deletePost(@RequestBody UserPostFgn userPostFgn);
}
