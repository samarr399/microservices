package com.microservices.limitsservice.limitsservice.controller;

import com.microservices.limitsservice.limitsservice.LimitConfiguration;
import com.microservices.limitsservice.limitsservice.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/limits")
public class LimitsConfigurationController {
    @Autowired
    private Configuration configuration;

    @GetMapping
    private LimitConfiguration retrieveLimitsFromConfigurations() {
        return new LimitConfiguration(configuration.getMinimum(), configuration.getMaximum());
    }
}
