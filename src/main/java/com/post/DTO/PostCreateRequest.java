package com.post.DTO;

import com.post.Entity.Post;

public record PostCreateRequest (
        String title,
        String body
) {
  public static Post convertToPost(PostCreateRequest request){
    return new Post(
            request.title,
            request.body
    );
  }
}