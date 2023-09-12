package com.example.blog_post_service.service.impl;

import com.example.blog_post_service.dto.postDto.BlogPostCreateRequestDto;
import com.example.blog_post_service.dto.postDto.BlogPostResponseByIdDto;
import com.example.blog_post_service.dto.postDto.BlogPostResponseShortDto;
import com.example.blog_post_service.entity.BlogPost;
import com.example.blog_post_service.entity.BlogUser;
import com.example.blog_post_service.entity.Tag;
import com.example.blog_post_service.entity.status.BlogPostStatus;
import com.example.blog_post_service.mapper.BlogPostMapper;
import com.example.blog_post_service.repository.BlogPostRepository;
import com.example.blog_post_service.repository.BlogUserRepository;
import com.example.blog_post_service.repository.TagRepository;
import com.example.blog_post_service.service.BlogPostService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.Instant;
import java.util.Comparator;
import java.util.List;

@AllArgsConstructor
@Service
public class BlogPostServiceImpl implements BlogPostService {

    private BlogPostRepository blogPostRepository;
    private final TagRepository tagRepository;
    private BlogUserRepository blogUserRepository;
    private BlogPostMapper blogPostMapper;
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
        BlogUser blogUser = blogUserRepository.findById(request.getBlogUserId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        List<Tag> tags = request.getTags().stream()
                .map(tag -> getOrCreateTag(String.valueOf(tag)))
                .toList();

        BlogPost blogPost = BlogPost.builder()
                .title(request.getTitle())
                .body(request.getBody())
                .tags(tags)
                .blogPostStatus(BlogPostStatus.UNPUBLISHED)
                .blogUser(blogUser)
                .createdOn(Instant.now())
                .updatedOn(Instant.now())
                .build();

        blogPost.setCreatedOn(Instant.now());
        blogPost.setUpdatedOn(Instant.now());

        blogPostRepository.save(blogPost);

    }

    @Override
    public List<BlogPostResponseShortDto> getPosts() {
       List<BlogPost>posts = blogPostRepository.findBlogPostByBlogPostStatus(BlogPostStatus.PUBLISHED);
       return posts.stream()
                .sorted(Comparator.comparing(BlogPost::getCreatedOn).reversed())
                .map(blogPost-> blogPostMapper.blogPostToDto(blogPost))
                .toList();
    }

    @Override
    public BlogPostResponseByIdDto getPostById(Long id) {
       var blogPost = blogPostRepository.findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
       return blogPostMapper.blogPostToDtoById(blogPost);
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
