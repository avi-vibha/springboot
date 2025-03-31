package com.vibha.springboot_kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    // creating a Kafk topic in a Kafka cluster
    @Bean
    public NewTopic createkafkaTopic () {
        return TopicBuilder.name("topic_001").build();
    }   

}
