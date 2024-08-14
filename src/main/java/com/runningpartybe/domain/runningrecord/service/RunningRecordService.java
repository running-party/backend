package com.runningpartybe.domain.runningrecord.service;

import com.runningpartybe.domain.runningrecord.repository.RunningRecordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RunningRecordService {

  private final RunningRecordRepository runningRecordRepository;

}
