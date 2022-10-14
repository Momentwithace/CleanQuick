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
@Entity
@ToString
public class User extends CleanQuickUser{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @OneToMany
    private Set<Address> address = new HashSet<>();

}
