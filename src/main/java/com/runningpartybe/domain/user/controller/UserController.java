package com.runningpartybe.domain.user.controller;

import com.runningpartybe.dto.UserDto;
import com.runningpartybe.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:8000")
@RequestMapping("/v1/user")
public class UserController {

  private final UserService userService;

  @PostMapping("/signup")
  public ResponseEntity<String> signUp(@RequestBody UserDto userDto) {
    userService.signUp(userDto);
    return ResponseEntity.ok("회원가입이 완료되었습니다.");
  }

  // 회원 정보 조회 API
  @GetMapping("/{userId}")
  public ResponseEntity<UserDto> getUserInfo(@PathVariable Long userId) {
    UserDto userDto = userService.getUserInfo(userId);

    if (userDto != null) {
      return ResponseEntity.ok(userDto); // 200 OK와 함께 사용자 정보 반환
    } else {
      return ResponseEntity.notFound().build(); // 404 Not Found 반환
    }
  }



}
