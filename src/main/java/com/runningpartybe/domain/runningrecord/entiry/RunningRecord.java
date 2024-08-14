package com.runningpartybe.domain.runningrecord.entiry;

import com.runningpartybe.domain.user.entity.User;
import com.runningpartybe.global.entity.Timestamped;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "running_record")
public class RunningRecord extends Timestamped {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "user_id")
  private String loginId;

  @Column(name = "distance")
  private String distance;

  @Column(name = "pace")
  private String pace;

  @Column(name = "time")
  private String time;


}
