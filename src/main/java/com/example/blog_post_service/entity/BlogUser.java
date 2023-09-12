package com.example.blog_post_service.entity;

import com.example.blog_post_service.entity.status.AccountStatus;
import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder

@Entity
@Table(name = "bloguser")
public class BlogUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column (name = "first_name")
    private String firstName;

    @Column (name = "last_name")
    private String lastName;

    @Column(name = "username")
    private String username;

    @Column (name = "account_status")
    private AccountStatus accountStatus;

    @Column (name = "is_admin")
    private Boolean isAdmin;

    @Column (name = "updated_on")
    private Instant updatedOn;

    @Column(name = "created_on")
    private Instant createdOn;



//    @Column(name = "roles")
//    private Set<String>/Role roles;

}
