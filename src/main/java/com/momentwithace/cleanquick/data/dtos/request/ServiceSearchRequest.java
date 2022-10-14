package com.momentwithace.cleanquick.data.dtos.request;

import com.momentwithace.cleanquick.data.models.Location;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ServiceSearchRequest {
    private Location location;
}
