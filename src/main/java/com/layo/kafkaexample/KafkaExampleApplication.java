package com.layo.kafkaexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class KafkaExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(KafkaExampleApplication.class, args);
    }
}
