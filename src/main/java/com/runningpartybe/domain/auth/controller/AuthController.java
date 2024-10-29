package com.runningpartybe.domain.auth.controller;

import com.runningpartybe.domain.auth.service.AuthService;
import com.runningpartybe.dto.auth.request.AuthRequestDto;
import com.runningpartybe.dto.auth.response.AuthResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/auth")
@RequiredArgsConstructor
public class AuthController {

  private final AuthService authService;

  // 일반 로그인 처리
  @CrossOrigin(origins = "http://localhost:8000")
  @PostMapping("/login")
  public ResponseEntity<AuthResponseDto> login(@RequestBody AuthRequestDto authRequestDto) {
    // 로그인 ID와 비밀번호가 있는 경우 일반 로그인으로 처리
    if (authRequestDto.getLoginId() != null && authRequestDto.getPassword() != null) {
      System.out.println("=============================");
      AuthResponseDto response = authService.login(authRequestDto);
      System.out.println("=============================");
      return ResponseEntity.ok(response);
    }

    // 유효하지 않은 요청일 경우
    return ResponseEntity.badRequest().build();
  }
}
