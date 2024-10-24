package com.runningpartybe.domain.auth.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.runningpartybe.domain.user.entity.User;


import java.time.LocalDateTime;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Auth {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "user_id")
  private User user;  // 유저와 연결된 관계

  private String loginIp;  // 로그인 IP 주소
  private String userAgent;  // 클라이언트의 User-Agent 정보

  private LocalDateTime loginTime;  // 로그인 시간
  private LocalDateTime logoutTime;  // 로그아웃 시간 (로그아웃 시 기록)

  private Boolean success;  // 로그인 성공 여부
}
