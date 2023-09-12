package com.example.blog_post_service.mapper;
import com.example.blog_post_service.dto.entryDto.RequestRegistrationDto;
import com.example.blog_post_service.entity.BlogUser;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BlogUserMapper {
    BlogUser dtoToBlogUser (RequestRegistrationDto requestRegistrationDto);

}
