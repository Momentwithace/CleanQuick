package com.momentwithace.cleanquick.data.models;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Entity;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class WorkPeriod {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String workHours;
    private WorkDays workDays;

}
