package com.runningpartybe.domain.user.controller;

import com.runningpartybe.dto.UserDto;
import com.runningpartybe.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:53419")
@RequestMapping("/v1/user")
public class UserController {

  private final UserService userService;

  @PostMapping("/signup")
  public ResponseEntity<String> signUp(@RequestBody UserDto userDto) {
    userService.signUp(userDto);
    return ResponseEntity.ok("회원가입이 완료되었습니다.");
  }

}
