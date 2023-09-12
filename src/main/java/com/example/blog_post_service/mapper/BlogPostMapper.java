package com.example.blog_post_service.mapper;

import com.example.blog_post_service.dto.postDto.BlogPostResponseByIdDto;
import com.example.blog_post_service.dto.postDto.BlogPostResponseShortDto;
import com.example.blog_post_service.entity.BlogPost;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring" )
public interface BlogPostMapper {
    BlogPostResponseShortDto blogPostToDto (BlogPost blogPost);
    BlogPostResponseByIdDto blogPostToDtoById(BlogPost blogPost);

}
