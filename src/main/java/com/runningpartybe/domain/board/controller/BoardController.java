package com.runningpartybe.domain.board.controller;

import com.runningpartybe.domain.board.service.BoardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class BoardController {

  @GetMapping("/boards")
  public ResponseEntity<List<BoardService>> getBoards() {
    List<BoardService> boards = new ArrayList<>();
    boards.add(new BoardService(1, "First Board", "Running Party!"));
    boards.add(new BoardService(2, "Second Board", "keep going!"));
    return ResponseEntity.ok(boards);
  }
}

