package com.momentwithace.cleanquick.data.dtos.request;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRegisterRequest {
    private String country;
    private String email;
    private String password;
}
