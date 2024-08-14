package com.runningpartybe.domain.runningrecord.repository;

import com.runningpartybe.domain.runningrecord.entiry.RunningRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RunningRecordRepository extends JpaRepository<RunningRecord, Long> {

}
