package com.runningpartybe.domain.user.repository;

import com.runningpartybe.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

  // 로그인 ID로 사용자 찾기
  Optional<User> findByLoginId(String loginId);

  // 이메일로 사용자 찾기
  Optional<User> findByEmail(String email);

  // 이메일 중복 여부 확인
  boolean existsByEmail(String email);

  // 로그인 ID 중복 여부 확인
  boolean existsByLoginId(String loginId);
}
