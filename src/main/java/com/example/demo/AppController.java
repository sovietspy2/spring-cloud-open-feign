package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppController {

    @Autowired
    private JSONPlaceholderClient jsonPlaceHolderClient;

    @GetMapping("/posts")
    public List<Post> getPosts() {
        return jsonPlaceHolderClient.getPosts();
    }

    @GetMapping("/posts/{id}")
    public Post getPostById(@PathVariable Integer id) {
        return jsonPlaceHolderClient.getPostById(id);
    }
}
