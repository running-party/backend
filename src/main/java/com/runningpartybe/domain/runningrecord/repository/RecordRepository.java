package com.runningpartybe.domain.runningrecord.repository;

import com.runningpartybe.domain.runningrecord.entiry.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
