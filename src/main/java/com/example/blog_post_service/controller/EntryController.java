package com.example.blog_post_service.controller;

import com.example.blog_post_service.dto.entryDto.RequestRegistrationDto;
import com.example.blog_post_service.service.EntryService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class EntryController {

    private final EntryService entryService;

    @PostMapping("/entry/registration")
    public void registerUser(@RequestBody RequestRegistrationDto request){
        entryService.registerUser(request);
    }
}
