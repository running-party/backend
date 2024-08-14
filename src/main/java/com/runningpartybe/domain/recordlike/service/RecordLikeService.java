package com.runningpartybe.domain.recordlike.service;

import com.runningpartybe.domain.recordlike.repository.RecordLikeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RecordLikeService {

  private final RecordLikeRepository recordLikeRepository;

}
