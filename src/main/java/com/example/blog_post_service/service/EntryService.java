package com.example.blog_post_service.service;

import com.example.blog_post_service.dto.entryDto.RequestRegistrationDto;

public interface EntryService {

    void registerUser(RequestRegistrationDto request);
}
