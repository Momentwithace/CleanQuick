package com.momentwithace.cleanquick.data.dtos.response;

import com.momentwithace.cleanquick.data.models.Location;
import lombok.*;


import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class ServiceSearchResponse {
    private String message;
    private List<Location> locationList;
    private String code;
}
