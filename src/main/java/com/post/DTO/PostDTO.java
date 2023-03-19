package com.post.DTO;

import com.post.Entity.Post;

import java.util.List;

public record PostDTO (
        String id,
        String title,
        String body,
        String createDate,
        String updateDate
) {
  public static PostDTO convertToPostDto(Post post){
    return new PostDTO(
            post.getId(),
            post.getTitle(),
            post.getBody(),
            String.valueOf(post.getCreateDate()),
            String.valueOf(post.getUpdateDate())
    );
  }

  public static List<PostDTO> convertAllToBookDto(List<Post> books){
    return books.stream().map(PostDTO::convertToPostDto).toList();
  }
}