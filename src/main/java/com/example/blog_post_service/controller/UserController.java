package com.example.blog_post_service.controller;


import com.example.blog_post_service.service.BlogUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final BlogUserService blogUserService;




}
