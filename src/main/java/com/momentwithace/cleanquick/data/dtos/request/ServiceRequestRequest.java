package com.momentwithace.cleanquick.data.dtos.request;

import com.momentwithace.cleanquick.data.models.ServiceType;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ServiceRequestRequest {
    private Boolean requestStatus;
    private ServiceType serviceType;

}
