package com.example.blog_post_service.repository;

import com.example.blog_post_service.entity.BlogUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogUserRepository extends JpaRepository<BlogUser, Long> {

    boolean existsByUsername(String username);
}
