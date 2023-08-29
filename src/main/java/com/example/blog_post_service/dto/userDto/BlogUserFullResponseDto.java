package com.example.blog_post_service.dto.userDto;

import com.example.blog_post_service.dto.postDto.PostResponseShortDto;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder

public class BlogUserFullResponseDto {

    private Long id;
    private String firstname;
    private String lastName;
    private String userName;
    private List<PostResponseShortDto>posts;
}
