package com.runningpartybe.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(authz -> authz
                            .requestMatchers("/v1/auth/login", "/v1/user/signup").permitAll()
                    // 인증 없이 접근 가능하도록 설정
                    .anyRequest().authenticated()
                    // 나머지 요청은 인증 요구
            );
    return http.build();
  }

  // PasswordEncoder를 빈으로 등록
  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }


}
