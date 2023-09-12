package com.example.blog_post_service.entity;

import com.example.blog_post_service.entity.status.BlogPostStatus;
//import jakarta.persistence.*;
import lombok.*;
import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder

@Entity
@Table(name = "blog_post")
public class BlogPost {

    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "body")
    private String body;

    @Column(name = "post_status")
    private BlogPostStatus blogPostStatus;

    @Column(name = "created_on")
    private Instant createdOn;

    @Column(name = "updated_on")
    private Instant updatedOn;

    @ManyToOne
    @JoinColumn(name = "blog_user_id", referencedColumnName = "id")
    private BlogUser blogUser;

    @ManyToMany
    @JoinTable(name = "post_tags",
            joinColumns = {
                @JoinColumn(name = "blog_post_id", referencedColumnName = "id")},
            inverseJoinColumns = {
            @JoinColumn(name = "tag_ig", referencedColumnName = "id")})
    private List<Tag> tags;
}
