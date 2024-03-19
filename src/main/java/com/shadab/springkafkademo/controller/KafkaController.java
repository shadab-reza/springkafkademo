package com.shadab.springkafkademo.controller;

import com.shadab.springkafkademo.service.kafka.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    private Producer producer;
    @GetMapping("/kafka/produce")
    public void getKafkaTopicMsg(@RequestParam String message){
        producer.sendMsgTopic(message);
    }
}
