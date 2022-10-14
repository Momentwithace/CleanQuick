package com.momentwithace.cleanquick.data.dtos.response;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LogOutResponse {
    private String message;
    private String code;
}
