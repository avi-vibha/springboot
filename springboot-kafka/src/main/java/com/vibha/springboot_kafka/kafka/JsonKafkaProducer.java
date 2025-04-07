package com.vibha.springboot_kafka.kafka;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.vibha.springboot_kafka.dto.User;

@Service
public class JsonKafkaProducer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducer.class);

    private KafkaTemplate<String,User> kafkaTemplate;

    public JsonKafkaProducer (KafkaTemplate<String,User> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage (User data) {
        
        Message<User>  message = MessageBuilder
                                .withPayload(data)
                                .setHeader(KafkaHeaders.TOPIC, "topic_002") 
                                .build();

        kafkaTemplate.send(message);
                             
    }

}
