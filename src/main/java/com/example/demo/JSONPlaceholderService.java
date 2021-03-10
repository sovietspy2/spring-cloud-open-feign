package com.example.demo;

import java.util.List;

public interface JSONPlaceholderService {

    List<Post> getPosts();

    Post getPostById(Integer id);
}
