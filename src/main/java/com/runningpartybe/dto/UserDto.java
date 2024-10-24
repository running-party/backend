package com.runningpartybe.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {

  // 공통 필드
  private Long id; // 조회 시 반환되는 고유 ID
  private String loginId; // 로그인 ID
  private String password; // 비밀번호
  private String nickname; // 닉네임
  private String email; // 이메일
  private String image; // 유저 프로필 이미지

  // 추가 필드: 역할(role) 및 기타 정보
  private String role;
  private String kakaoId; // 카카오 로그인 사용자 고유 ID
  private Boolean isArchived; // 탈퇴 여부

  // 필요한 경우 특정 생성자를 정의해 사용할 수 있음
  public UserDto(String loginId, String password, String nickname, String email) {
    this.loginId = loginId;
    this.password = password;
    this.nickname = nickname;
    this.email = email;
  }

  // Getter 및 Setter
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getLoginId() {
    return loginId;
  }

  public void setLoginId(String loginId) {
    this.loginId = loginId;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getKakaoId() {
    return kakaoId;
  }

  public void setKakaoId(String kakaoId) {
    this.kakaoId = kakaoId;
  }

  public Boolean getIsArchived() {
    return isArchived;
  }

  public void setIsArchived(Boolean isArchived) {
    this.isArchived = isArchived;
  }

  // 필요한 경우 toString(), equals(), hashCode() 등을 추가할 수 있습니다.
}

