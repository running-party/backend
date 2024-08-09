package com.runningpartybe.board;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

// Board.java
public class Board {
  private int id;
  private String name;
  private String content;

  // 기본 생성자 (필요한 경우)
  public Board() {}

  public Board(int id, String name, String content) {
    this.id = id;
    this.name = name;
    this.content = content;
  }

  // Getter and Setter
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}


