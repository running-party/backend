package com.runningpartybe.domain.board.service;

import com.runningpartybe.domain.board.dto.BoardDto;
import com.runningpartybe.domain.board.entity.Board;
import com.runningpartybe.domain.board.repository.BoardRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BoardServiceImpl implements BoardService {

  private final BoardRepository boardRepository;

  public BoardServiceImpl(BoardRepository boardRepository) {
    this.boardRepository = boardRepository;
  }

  @Override
  public List<BoardDto> getAllBoards() {
    return boardRepository.findAll().stream().map(this::convertToDto).collect(Collectors.toList());
  }

  @Override
  public BoardDto getBoardById(Long id) {
    Board board = boardRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Board not found"));
    return convertToDto(board);
  }

  @Override
  public BoardDto createBoard(BoardDto boardDto) {
    return null;
  }

  @Override
  @Transactional
  public BoardDto createBoard(BoardDto boardDto) {
    Board board = new Board();
    board.setTitle(boardDto.getTitle());
    board.setContent(boardDto.getContent());
    board.setAuthor(boardDto.getAuthor());
    boardRepository.save(board);
    return convertToDto(board);
  }

  @Override
  public void deleteBoard(Long id) {
    boardRepository.deleteById(id);
  }

  private BoardDto convertToDto(Board board) {
    BoardDto Dto = new BoardDto();
    dto.setId(board.getId());
    dto.setTitle(board.getTitle());
    dto.setContent(board.getContent());
    dto.setAuthor(board.getAuthor());
    dto.setCreatedAt(board.getCreatedAt());
    return dto;
  }
}
