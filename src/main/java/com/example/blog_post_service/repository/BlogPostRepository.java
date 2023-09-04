package com.example.blog_post_service.repository;

import com.example.blog_post_service.entity.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {

}
