package com.example.blog_post_service.service.impl;

import com.example.blog_post_service.repository.BlogUserRepository;
import com.example.blog_post_service.service.BlogUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BlogUserServiceImpl implements BlogUserService {

    private BlogUserRepository blogUserRepository;
}
