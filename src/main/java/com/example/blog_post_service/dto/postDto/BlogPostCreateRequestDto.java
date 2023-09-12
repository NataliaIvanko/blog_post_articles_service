package com.example.blog_post_service.dto.postDto;

import com.example.blog_post_service.entity.Tag;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class BlogPostCreateRequestDto {

    private String title;
    private String body;
    private Long blogUserId;
    private List<Tag> tags;
}
