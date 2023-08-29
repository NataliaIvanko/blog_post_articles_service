package com.example.blog_post_service.dto.postDto;

import com.example.blog_post_service.entity.BlogUser;
import com.example.blog_post_service.entity.status.PostStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class PostResponseFullDto {

    private Long id;
    private String title;
    private String body;
    private PostStatus postStatus;
    private Long userId;
    private Set<Long> tagIds;
}
