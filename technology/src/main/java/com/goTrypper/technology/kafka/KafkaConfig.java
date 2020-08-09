package com.goTrypper.technology.kafka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {
    @Value("${spring.kafka.bootstrap-servers}")
    private String kafkaBootStrapServer;

    @Value("${spring.kafka.dev-topic-name}")
    private String kafkaTopicName;

    public String getKafkaBootStrapServer() {
        return kafkaBootStrapServer;
    }

    public void setKafkaBootStrapServer(String kafkaBootStrapServer) {
        this.kafkaBootStrapServer = kafkaBootStrapServer;
    }

    public String getKafkaTopicName() {
        return kafkaTopicName;
    }

    public void setKafkaTopicName(String kafkaTopicName) {
        this.kafkaTopicName = kafkaTopicName;
    }
}
