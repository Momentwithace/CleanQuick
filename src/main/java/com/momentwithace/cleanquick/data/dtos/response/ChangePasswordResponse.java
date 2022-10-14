package com.momentwithace.cleanquick.data.dtos.response;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChangePasswordResponse {
    private String message;
    private String code;
}
