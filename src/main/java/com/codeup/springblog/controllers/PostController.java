package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String viewPosts() {
        return "View all posts.";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String singlePost(@PathVariable long id) {
        return "View and individual post";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String createForm() {
        return "View form to create a post.";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPosts() {
        return "Create a new post.";

    }
}
