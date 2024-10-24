package com.runningpartybe.domain.auth.service.implement;

import com.runningpartybe.domain.auth.service.AuthService;
import com.runningpartybe.domain.user.repository.UserRepository;
import com.runningpartybe.dto.auth.request.AuthRequestDto;
import com.runningpartybe.dto.auth.response.AuthResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

  private final UserRepository userRepository;
  private final PasswordEncoder passwordEncoder;
  //private final JwtTokenProvider jwtTokenProvider;

  @Override
  public AuthResponseDto login(AuthRequestDto authRequestDto) {
    // 사용자 조회
    User user = userRepository.findByLoginId(authRequestDto.getLoginId())
            .orElseThrow(() -> new IllegalArgumentException("아이디 또는 비밀번호가 잘못되었습니다."));

    // 비밀번호 검증
    if (!passwordEncoder.matches(authRequestDto.getPassword(), user.getPassword())) {
      throw new IllegalArgumentException("아이디 또는 비밀번호가 잘못되었습니다.");
    }

    // JWT 토큰 생성
    //String token = jwtTokenProvider.createToken(user.getLoginId(), user.getRole());

    // 응답 생성
    return AuthResponseDto.builder()
            .token(token)
            .id(user.getId())
            .loginId(user.getLoginId())
            .nickname(user.getNickname())
            .email(user.getEmail())
            .role(user.getRole())
            .image(user.getImage())
            .build();
  }

}
