package com.runningpartybe.dto.auth.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AuthRequestDto {

  // 로그인 ID와 비밀번호를 통한 일반 로그인 요청 시 사용
  private String loginId;  // 로그인 ID
  private String password; // 비밀번호

  // 소셜 로그인을 위한 필드
  private String socialToken;  // 소셜 로그인 시 사용되는 액세스 토큰
  private String provider;     // 소셜 로그인 제공자 (e.g., google, kakao, naver)

  // 로그인 ID와 비밀번호를 통한 로그인
  public AuthRequestDto(String loginId, String password) {
    this.loginId = loginId;
    this.password = password;
  }

}
