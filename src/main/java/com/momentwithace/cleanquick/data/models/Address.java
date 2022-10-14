package com.momentwithace.cleanquick.data.models;

import lombok.*;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Address {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private int buildingNumber;
    private String street;
    private String city;


}
