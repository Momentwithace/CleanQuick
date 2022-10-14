package com.momentwithace.cleanquick.data.dtos.request;

import com.momentwithace.cleanquick.data.models.Address;
import lombok.*;


@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProfileRequest {
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private String password;
    private String phoneNumber;
    private String imageUrl;
    private Address address;
}
