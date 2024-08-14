package com.runningpartybe.domain.user.repository;

import com.runningpartybe.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
