package com.layo.kafkaexample.tasks;

import com.layo.kafkaexample.engine.Producer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.support.SendResult;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

import java.time.LocalDate;
import java.util.concurrent.ExecutionException;

@Component
public class SendMessageTask {
    private final Logger logger = LoggerFactory.getLogger(SendMessageTask.class);


    private final Producer producer;

    public SendMessageTask(Producer producer) {
        this.producer = producer;
    }

    // run every 3 sec
    @Scheduled(fixedRateString = "3000")
    public void send() throws ExecutionException, InterruptedException {

        // We set the topic here.
        ListenableFuture<SendResult<String, String>> listenableFuture = this.producer.sendMessage("INPUT_DATA", "IN_KEY", LocalDate.now().toString());

        SendResult<String, String> result = listenableFuture.get();
        logger.info(String.format("Produced:\ntopic: %s\noffset: %d\npartition: %d\nvalue size: %d", result.getRecordMetadata().topic(),
                result.getRecordMetadata().offset(),
                result.getRecordMetadata().partition(), result.getRecordMetadata().serializedValueSize()));
    }
}