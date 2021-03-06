package com.dreamfoxick.friendservice.service.vkclient.json.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class SingleObject<R extends JsonMarker> {

    @JsonProperty(value = "response")
    private R response;
}
