package com.runningpartybe.domain.comment.repository;

import com.runningpartybe.domain.comment.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
