package com.example.blog_post_service.repository;

import com.example.blog_post_service.dto.postDto.BlogPostResponseShortDto;
import com.example.blog_post_service.entity.BlogPost;
import com.example.blog_post_service.entity.status.BlogPostStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
List<BlogPost> findBlogPostByBlogPostStatus(BlogPostStatus status);
}
