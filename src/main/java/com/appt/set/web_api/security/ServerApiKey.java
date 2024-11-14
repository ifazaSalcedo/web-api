package com.appt.set.web_api.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class ServerApiKey {
    @Value("${api.key}")
    private String apiKey;
    @Value("${api.key}")
    private String[] apiOrigins;
}
