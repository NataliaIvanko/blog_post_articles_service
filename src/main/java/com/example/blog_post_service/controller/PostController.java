package com.example.blog_post_service.controller;

import com.example.blog_post_service.dto.postDto.BlogPostCreateRequestDto;
import com.example.blog_post_service.dto.postDto.BlogPostResponseByIdDto;
import com.example.blog_post_service.dto.postDto.BlogPostResponseShortDto;
import com.example.blog_post_service.service.BlogPostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostController {

    private final BlogPostService blogPostService;

    @PostMapping("/posts/create")
    public void createPost(@RequestBody BlogPostCreateRequestDto request){
        blogPostService.createPost(request);
    }
    @GetMapping("/post")
    public List<BlogPostResponseShortDto> getPosts(){
        return blogPostService.getPosts();
    }
    @GetMapping("/posts/{id}")
    public BlogPostResponseByIdDto getPostById(@PathVariable("id") Long id){
        return blogPostService.getPostById(id);
    }

}
