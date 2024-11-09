package com.example.BlogApp.repository;


import org.springframework.stereotype.Repository;
import com.example.BlogApp.domain.Post;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;


@Repository
public class PostRepository {
    private final Set<Post> posts= new CopyOnWriteArraySet<>();

    public void addPost (Post post)
    {
        posts.add(post);
    }

    public Set<Post> findAllPosts()
    {
        return posts;
    }
}
