package com.robertowgsf.email.config;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonSESConfig {
    @Value("${cloud.aws.credentials.profile-name}")
    private String profileName;
    @Value("${cloud.aws.region.static}")
    private String region;

    @Bean
    public AmazonSimpleEmailService amazonSimpleEmailService() {
        return AmazonSimpleEmailServiceClientBuilder.standard()
                .withCredentials(new ProfileCredentialsProvider(profileName))
                .withRegion(Regions.fromName(region))
                .build();
    }
}
