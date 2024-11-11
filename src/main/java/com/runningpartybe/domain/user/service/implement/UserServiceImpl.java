package com.runningpartybe.domain.user.service.implement;

import com.runningpartybe.dto.UserDto;
import com.runningpartybe.domain.user.entity.User;
import com.runningpartybe.domain.user.entity.UserRoleEnum;
import com.runningpartybe.domain.user.repository.UserRepository;
import com.runningpartybe.domain.user.service.UserService;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder; // 비밀번호 암호화 처리

    @Override
    public void signUp(UserDto userDto) {
        // 비밀번호 암호화
        String encodedPassword = passwordEncoder.encode(userDto.getPassword());

        // 유저 객체 생성
        User user = User.builder()
                .loginId(userDto.getLoginId())
                .password(encodedPassword)  // 암호화된 비밀번호 저장
                .nickname(userDto.getNickname())
                .email(userDto.getEmail())
                .image(userDto.getImage())  // 프로필 이미지
                .kakaoId(userDto.getKakaoId())
                .isArchived(false)  // 기본값으로 탈퇴 여부를 false로 설정
                .role(UserRoleEnum.USER)  // 기본 권한은 USER
                .build();

        // 유저 정보 저장
        userRepository.save(user);
    }

    @Override
    //@Transactional(readOnly = true)
    public UserDto getUserInfo(Long userId) {
        // 회원 정보 조회 로직
        Optional<User> optionalUser = userRepository.findById(userId);

        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            return new UserDto(user.getId(), user.getNickname(), user.getEmail(),
                    user.getPassword());
        } else {
            return null;
        }
    }

}
