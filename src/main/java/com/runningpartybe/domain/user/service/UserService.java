package com.runningpartybe.domain.user.service;

import com.runningpartybe.dto.UserDto;

public interface UserService {

  // 회원가입
  void signUp(UserDto userDto);

}
