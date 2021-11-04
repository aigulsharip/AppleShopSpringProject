package com.example.practice3jpa.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageSenderImpl implements KafkaMessageSender {

    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("${spring.kafka.template.default-topic:app-test}")
    private String topic;

    @Override
    public void sendMessage(String message){
        kafkaTemplate.send(topic, message);
    }

    @Autowired
    public KafkaMessageSenderImpl(KafkaTemplate<String, String> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }
}