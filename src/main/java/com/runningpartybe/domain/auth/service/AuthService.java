package com.runningpartybe.domain.auth.service;

import com.runningpartybe.dto.auth.request.AuthRequestDto;
import com.runningpartybe.dto.auth.response.AuthResponseDto;

public interface AuthService {

  // 일반 로그인 처리
  AuthResponseDto login(AuthRequestDto authRequestDto);

}
