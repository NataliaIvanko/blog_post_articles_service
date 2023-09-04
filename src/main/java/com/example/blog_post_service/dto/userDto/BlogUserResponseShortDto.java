package com.example.blog_post_service.dto.userDto;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class BlogUserResponseShortDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String userName;
    private Long postCount;


}
