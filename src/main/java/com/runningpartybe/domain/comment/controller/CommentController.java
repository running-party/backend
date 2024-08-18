package com.runningpartybe.domain.comment.controller;

import com.runningpartybe.domain.comment.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/comment")
public class CommentController {

  private final CommentService commentService;

}
