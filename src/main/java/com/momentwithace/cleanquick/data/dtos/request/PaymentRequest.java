package com.momentwithace.cleanquick.data.dtos.request;

import com.momentwithace.cleanquick.data.models.PaymentType;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentRequest {
    private PaymentType paymentType;
    private String password;
}
