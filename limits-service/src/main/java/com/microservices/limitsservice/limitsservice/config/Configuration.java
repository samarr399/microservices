package com.microservices.limitsservice.limitsservice.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "limit-service")
public class Configuration {
    private Integer minimum;
    private Integer maximum;
}
