package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {
    List<Post> posts = new ArrayList<>();


    @GetMapping("/posts")
    @ResponseBody
    public String viewPosts(Model model) {
        posts.add(new Post("This is post1", "This is post1s body"));
        posts.add(new Post("This is post2", "This is post2s body"));
        model.addAttribute("posts", posts);
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
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
