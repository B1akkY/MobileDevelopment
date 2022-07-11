package com.example.MobileDevelopment.controllers;

import com.example.MobileDevelopment.models.Post;
import com.example.MobileDevelopment.repo.PostRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RunWith(SpringRunner.class)
@SpringBootTest
class BlogControllerTest {
    @Autowired
    private BlogController controller;

    @MockBean
    private PostRepository postRepository;

    @MockBean
    private Post post;

    @Test
    void blogPostAdd() {

    }

    @Test
    void blogPostDelete() {

    }
}