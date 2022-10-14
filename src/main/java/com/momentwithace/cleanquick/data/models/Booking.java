package com.momentwithace.cleanquick.data.models;

import lombok.*;

import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String pickUpDate;
    private String deliveryDate;
    private String pickUpTime;
    private String deliveryTime;
    @OneToMany
    private Set<Address> pickUpAddress = new HashSet<>();
    @OneToMany
    private Set<Address> deliveryAddress = new HashSet<>();
    private String deliveryPhoneNumber;

}
