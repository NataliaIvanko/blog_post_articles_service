package com.example.blog_post_service.dto.postDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PostSearchRequestDto {

    private String title;
    private String firstName;
    private String lastName;
    private List<Long> tagIds;

}
