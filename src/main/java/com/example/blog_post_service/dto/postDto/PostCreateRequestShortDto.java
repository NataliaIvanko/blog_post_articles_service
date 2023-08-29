package com.example.blog_post_service.dto.postDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PostCreateRequestShortDto {

    private String title;
    private String body;
    private Long userId;
    private List<Long> tagIds;
}
