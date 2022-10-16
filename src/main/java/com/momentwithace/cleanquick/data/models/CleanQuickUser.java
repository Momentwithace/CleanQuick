package com.momentwithace.cleanquick.data.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

public class CleanQuickUser {
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private String password;
    private String phoneNumber;
    private String imageUrl;
    @OneToMany
    @Cascade(CascadeType.ALL)
    private List<Notification> message = new ArrayList<>();

}
