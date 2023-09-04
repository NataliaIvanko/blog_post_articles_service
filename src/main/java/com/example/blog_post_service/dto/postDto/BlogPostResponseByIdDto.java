package com.example.blog_post_service.dto.postDto;

import com.example.blog_post_service.entity.BlogUser;

import com.example.blog_post_service.entity.status.BlogPostStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class BlogPostResponseByIdDto {

    private Long id;
    private String title;
    private String body;
    private BlogPostStatus postStatus;
    private Long userId;
    private Set<Long> tagIds;
    private Instant updatedOn;
    private Instant createdOn;
}
