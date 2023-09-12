package com.example.blog_post_service.service;

import com.example.blog_post_service.dto.postDto.BlogPostCreateRequestDto;
import com.example.blog_post_service.dto.postDto.BlogPostResponseByIdDto;
import com.example.blog_post_service.dto.postDto.BlogPostResponseShortDto;

import java.util.List;

public interface BlogPostService {

    void createPost(BlogPostCreateRequestDto request);
    List<BlogPostResponseShortDto> getPosts();
    BlogPostResponseByIdDto getPostById(Long id);
}
