package com.example.blog_post_service.dto.entryDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class RequestRegistrationDto {

    private String firstName;
    private String lastName;
    private String username;
    private String password;

}
