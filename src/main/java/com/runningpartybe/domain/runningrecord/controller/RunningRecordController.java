package com.runningpartybe.domain.runningrecord.controller;

import com.runningpartybe.domain.runningrecord.service.RunningRecordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/record")
public class RunningRecordController {

  private final RunningRecordService runningRecordService;

}
