package com.runningpartybe.domain.board;

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
  public ResponseEntity<List<Board>> getBoards() {
    List<Board> boards = new ArrayList<>();
    boards.add(new Board(1, "First Board", "Running Party!"));
    boards.add(new Board(2, "Second Board", "keep going!"));
    return ResponseEntity.ok(boards);
  }
}

