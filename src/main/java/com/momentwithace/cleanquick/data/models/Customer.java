package com.momentwithace.cleanquick.data.models;

import lombok.*;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
public class Customer extends CleanQuickUser{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany(fetch = FetchType.EAGER)
    @Cascade(org.hibernate.annotations.CascadeType.PERSIST)
    private Set<Address> address = new HashSet<>();
}
