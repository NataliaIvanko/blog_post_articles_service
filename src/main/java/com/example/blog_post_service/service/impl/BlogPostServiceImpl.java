package com.example.blog_post_service.service.impl;

import com.example.blog_post_service.dto.postDto.BlogPostCreateRequestDto;
import com.example.blog_post_service.entity.BlogPost;
import com.example.blog_post_service.entity.BlogUser;
import com.example.blog_post_service.entity.Tag;
import com.example.blog_post_service.entity.status.BlogPostStatus;
import com.example.blog_post_service.repository.BlogPostRepository;
import com.example.blog_post_service.repository.BlogUserRepository;
import com.example.blog_post_service.repository.TagRepository;
import com.example.blog_post_service.service.BlogPostService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.Instant;
import java.util.List;

@AllArgsConstructor
@Service
public class BlogPostServiceImpl implements BlogPostService {

    private BlogPostRepository blogPostRepository;
    private final TagRepository tagRepository;
    private BlogUserRepository blogUserRepository;
    /*
           - blog id
   - blog title
   - blog body
   - tags []
   - blog status
   - authorId
            */
    @Override
    public void createPost(BlogPostCreateRequestDto request) {
        BlogUser author = blogUserRepository.findById(request.getUserId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        List<Tag> tags = request.getTags().stream()
                .map(tag -> getOrCreateTag(String.valueOf(tag)))
                .toList();

        BlogPost blogPost = BlogPost.builder()
                .title(request.getTitle())
                .body(request.getBody())
                .tags(tags)
                .blogPostStatus(BlogPostStatus.UNPUBLISHED)
                .author(author)
                .createdOn(Instant.now())
                .updatedOn(Instant.now())
                .build();

//        blogPost.setCreatedOn(Instant.now());
//        blogPost.setUpdatedOn(Instant.now());

        blogPostRepository.save(blogPost);

    }
    private Tag getOrCreateTag (String name){
        Tag tag = tagRepository.findByName(name);
        if(tag == null){
            tag = Tag.builder()
                    .name(name)
                    .build();
            tag = tagRepository.save(tag);
        }
        return tag;
    }
}
