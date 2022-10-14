package com.momentwithace.cleanquick.data.dtos.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRegisterResponse {
    private String message;
    private Long userId;
    private int code;
}
