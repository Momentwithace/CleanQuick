package com.momentwithace.cleanquick.data.dtos.response;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentResponse {
    private String message;
    private String code;
}
