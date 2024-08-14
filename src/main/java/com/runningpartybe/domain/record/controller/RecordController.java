package com.runningpartybe.domain.record.controller;

import com.runningpartybe.domain.record.service.RecordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/record")
public class RecordController {

  private final RecordService recordService;

}
