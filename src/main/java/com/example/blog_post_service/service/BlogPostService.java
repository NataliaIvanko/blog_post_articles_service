package com.example.blog_post_service.service;

import com.example.blog_post_service.dto.postDto.BlogPostCreateRequestDto;

public interface BlogPostService {

    void createPost(BlogPostCreateRequestDto request);
}
