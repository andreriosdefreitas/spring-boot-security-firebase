package com.example.demosecurity.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@ConfigurationProperties
public class FirebaseProperties {

    private String configFile;

    private String databaseUrl;

    private String tokenUrl;

    private String appKey;

    private String verifyEmailUrl;

}