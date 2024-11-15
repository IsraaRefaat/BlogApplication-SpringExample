package com.example.BlogApp.domain;


import org.springframework.stereotype.Service;
import com.example.BlogApp.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class PostService {
 private final PostRepository postRepository;

     public void addPost(Post post)
     {
         postRepository.addPost(post);
     }

     public Set<Post> findAllPosts()
     {
         return postRepository.findAllPosts();
     }

}
