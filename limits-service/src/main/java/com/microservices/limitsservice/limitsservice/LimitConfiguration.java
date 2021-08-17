package com.microservices.limitsservice.limitsservice;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LimitConfiguration {
    private Integer minimum;
    private Integer maximum;
}
