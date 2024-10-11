package com.runningpartybe.domain.board.controller;

import com.runningpartybe.domain.board.dto.BoardDto;
import com.runningpartybe.domain.board.service.BoardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/board")
public class BoardController {

  private final BoardService boardService;

  public BoardController(BoardService boardService) {
    this.boardService = boardService;
  }

  @GetMapping("/posts")
  public ResponseEntity<List<BoardDto>> getAllPosts() {
    List<BoardDto> posts = boardService.getAllBoards();
    return ResponseEntity.ok(posts);
  }

  @GetMapping("/posts/{id}")
  public ResponseEntity<BoardDto> getPostById(@PathVariable Long id) {
    BoardDto post = boardService.getBoardById(id);
    return ResponseEntity.ok(post);
  }

  @PostMapping("/posts")
  public ResponseEntity<BoardDto> createPost(@RequestBody BoardDto BoardDto) {
    BoardDto newPost = boardService.createBoard(BoardDto);
    return ResponseEntity.ok(newPost);
  }

  @DeleteMapping("/posts/{id}")
  public ResponseEntity<Void> deletePost(@PathVariable Long id) {
    boardService.deleteBoard(id);
    return ResponseEntity.noContent().build();
  }
}

