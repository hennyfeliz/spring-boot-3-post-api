package com.post.Service;

import com.post.DTO.PostCreateRequest;
import com.post.DTO.PostDTO;
import com.post.Repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
  private final PostRepository repository;

  public PostService(PostRepository repository) {
    this.repository = repository;
  }

  public PostDTO createPost(PostCreateRequest request){
    return PostDTO.convertToPostDto(repository.save(PostCreateRequest.convertToPost(request)));
  }
  public List<PostDTO> getAllPost() {
    return PostDTO.convertAllToBookDto(repository.findAll());
  }
  public PostDTO getPostById(String id){
    return PostDTO.convertToPostDto(repository.getById(id));
  }
}
