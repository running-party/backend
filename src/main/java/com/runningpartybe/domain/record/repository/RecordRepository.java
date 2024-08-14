package com.runningpartybe.domain.record.repository;

import com.runningpartybe.domain.record.entiry.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
