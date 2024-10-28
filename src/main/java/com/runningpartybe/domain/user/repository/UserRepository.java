package com.runningpartybe.domain.user.repository;

import com.runningpartybe.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
  // 추가적인 메서드 작성 (Optional: 예시로 사용자 ID로 조회하는 메서드)
  Optional<User> findByLoginId(String loginId);

  // 추가적으로 이메일로 찾는 메서드
  Optional<User> findByEmail(String email);
}
