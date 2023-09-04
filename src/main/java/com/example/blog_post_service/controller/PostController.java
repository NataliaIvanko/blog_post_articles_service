package com.example.blog_post_service.controller;

import com.example.blog_post_service.dto.postDto.BlogPostCreateRequestDto;
import com.example.blog_post_service.service.BlogPostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostController {

    private final BlogPostService blogPostService;

    @PostMapping("/posts/create")
    public void createPost(@RequestBody BlogPostCreateRequestDto request){
        blogPostService.createPost(request);
    }

}
