package com.shadab.springkafkademo.service.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics = "shad-kafka-topic",groupId = "shad-kafka-groupid")
    public void listenKafkaTopic(String message){
        System.out.println(message);
    }
}
