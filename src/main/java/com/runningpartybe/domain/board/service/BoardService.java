package com.runningpartybe.domain.board.service;


import com.runningpartybe.domain.board.dto.BoardDto;

import java.util.List;

// Board.java
public interface BoardService {
  List<BoardDto> getAllBoards();
  BoardDto getBoardById(Long id);
  BoardDto createBoard(BoardDto boardDto);
  void deleteBoard(Long id);
}


