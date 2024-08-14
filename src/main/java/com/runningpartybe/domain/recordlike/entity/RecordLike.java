package com.runningpartybe.domain.recordlike.entity;

import com.runningpartybe.domain.record.entiry.Record;
import com.runningpartybe.domain.user.entity.User;
import com.runningpartybe.global.entity.Timestamped;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "record_like")
public class RecordLike extends Timestamped {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)  // 성능 최적화를 위한 지연로딩
  @JoinColumn(name = "record_id")
  private Record record;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "user_id")
  private User user;

  @Column(name = "isLike")
  private boolean isLike;  // false를 default로 갖기 위해 원시타입 사용

}
