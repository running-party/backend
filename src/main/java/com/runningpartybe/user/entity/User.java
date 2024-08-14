package com.runningpartybe.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "member")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "login_id")
  private String loginId;

  @Column(name = "password")
  private String password;

  @Column(name = "nickname")
  private String nickname;

  // 카카오로그인 고유번호
  @Column(name = "kakao_id")
  private String kakaoId;

  @Column(name = "email")
  private String email;

  // 회원 탈퇴 여부
  @Column(name = "is_archived")
  private Boolean isArchived;

  @Column(name = "role")
  @Enumerated(value = EnumType.STRING)
  private UserRoleEnum role;

  // 유저 프로필 사진
  @Column(name = "image")
  private String image;


}
