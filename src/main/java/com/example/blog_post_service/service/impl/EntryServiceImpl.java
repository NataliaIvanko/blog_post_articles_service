package com.example.blog_post_service.service.impl;

import com.example.blog_post_service.dto.entryDto.RequestRegistrationDto;
import com.example.blog_post_service.entity.BlogUser;
import com.example.blog_post_service.mapper.BlogUserMapper;
import com.example.blog_post_service.repository.BlogUserRepository;
import com.example.blog_post_service.service.EntryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@AllArgsConstructor
@Service
public class EntryServiceImpl implements EntryService {

    private final BlogUserRepository blogUserRepository;
    private final BlogUserMapper blogUserMapper;


    @Override
    public void registerUser(RequestRegistrationDto request) {
               if(blogUserRepository.existsBlogUserByUsername(request.getUsername())) {
                   throw new ResponseStatusException(HttpStatus.CONFLICT);
               }
               BlogUser blogUser = blogUserMapper.dtoToBlogUser(request);

//            BlogUser blogUser = BlogUser.builder()
//                .firstName(request.getFirstName())
//                .lastName(request.getLastName())
//                .username(request.getUsername())
//                .build();

       blogUserRepository.save(blogUser);

    }
}
