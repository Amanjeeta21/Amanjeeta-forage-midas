package com.jpmc.midascore.component;

import com.jpmc.midascore.foundation.Transaction;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "${general.kafka-topic}", groupId = "${spring.kafka.consumer.group-id}")
    public void listen(Transaction transaction) {
        // High visibility print for the console
        System.out.println("*****************************************");
        System.out.println("VALUE DETECTED: " + transaction.getAmount());
        System.out.println("*****************************************");
    }
}