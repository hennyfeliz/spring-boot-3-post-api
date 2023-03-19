package com.post.Controller;

import com.post.DTO.PostCreateRequest;
import com.post.DTO.PostDTO;
import com.post.Service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/post")
public class PostController {
  private final PostService service;

  public PostController(PostService service) {
    this.service = service;
  }

  @PostMapping
  public PostDTO createPost(@RequestBody PostCreateRequest request){
    return service.createPost(request);
  }
  @GetMapping
  public List<PostDTO> getAllPost(){
    return service.getAllPost();
  }
  @GetMapping("/{id}")
  public PostDTO getPostById(@PathVariable String id){
    return service.getPostById(id);
  }
}
