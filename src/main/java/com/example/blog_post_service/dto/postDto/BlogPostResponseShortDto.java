package com.example.blog_post_service.dto.postDto;

import com.example.blog_post_service.entity.status.BlogPostStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class BlogPostResponseShortDto {

    private Long id;
    private String title;
    private BlogPostStatus postStatus;
}
