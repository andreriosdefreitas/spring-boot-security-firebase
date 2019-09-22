package com.example.demosecurity.config;

import java.io.IOException;

import javax.annotation.PostConstruct;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class FirebaseConfig {

    @Autowired
    private ApplicationProperties applicationProperties;

    @Value("${application.firebase.configFile}")
    private Resource configFile;

    @Bean
    public DatabaseReference firebaseDatabase() {
        return FirebaseDatabase.getInstance().getReference();
    }

    @PostConstruct
    public void init() throws IOException {
        log.debug("Initializing the Firebase's Configuration");
        FirebaseOptions options = new FirebaseOptions.Builder()
            .setCredentials(GoogleCredentials.fromStream(configFile.getInputStream()))
            .setDatabaseUrl(applicationProperties.getFirebase().getDatabaseUrl())
            .build();
        FirebaseApp.initializeApp(options);
    }
}