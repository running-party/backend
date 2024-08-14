package com.runningpartybe.domain.runningrecord.service;

import com.runningpartybe.domain.runningrecord.repository.RecordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RecordService {

  private final RecordRepository recordRepository;

}
