package com.example.blog_post_service.dto.postDto;

import com.example.blog_post_service.entity.status.PostStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PostResponseShortDto {

    private Long id;
    private String title;
    private PostStatus postStatus;
}
