package com.runningpartybe.dto.auth.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AuthResponseDto {

  private String token;       // 인증 토큰 (JWT 등)
  private Long id;            // 사용자 고유 ID
  private String loginId;     // 로그인 ID
  private String nickname;    // 사용자 닉네임
  private String email;       // 이메일
  private String role;        // 역할 (예: USER, ADMIN)
  private String image;       // 사용자 프로필 이미지 URL

  // 소셜 로그인의 경우 소셜 ID도 반환할 수 있음
  private String kakaoId;     // 카카오 로그인 사용자 고유 ID (소셜 로그인을 위한 필드)

  // 추가적인 사용자 상태 정보
  private Boolean isArchived; // 탈퇴 여부
}
