package com.layo.kafkaexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling // This is what makes it so our application does stuff as it goes in an takes the @Scheduled tasks.
@SpringBootApplication
public class KafkaExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(KafkaExampleApplication.class, args);
    }
}
