package com.momentwithace.cleanquick.data.dtos.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ServiceRequestResponse {
    private String message;
    private String emailNotification;
    private String code;
}
