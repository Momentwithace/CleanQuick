package com.momentwithace.cleanquick.data.dtos.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmailNotificationRequest {
    private String userEmail;
    private String mailContent;
}
