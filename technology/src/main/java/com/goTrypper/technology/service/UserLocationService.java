package com.goTrypper.technology.service;

import com.goTrypper.technology.kafka.KafkaConfig;
import com.goTrypper.technology.model.UserLocationObj;
import com.goTrypper.technology.repository.UserLocationRepositiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service

public class UserLocationService {
    @Autowired
    UserLocationRepositiory userLocationReposity;
    @Autowired
    private KafkaTemplate<String, UserLocationObj> kafkaTemplate;
    @Autowired
    KafkaConfig kafkaConfig;

    public void saveUserLocation(UserLocationObj userLocationObj) {
        UserLocationObj respose =  userLocationReposity.save(userLocationObj);
        sendKafkaMessage(respose);
    }

    public void sendKafkaMessage(UserLocationObj userLocationObj) {
        System.out.println("message sending to topic "+ kafkaConfig.getKafkaTopicName());
        kafkaTemplate.send(kafkaConfig.getKafkaTopicName(), userLocationObj);
        System.out.println("kafka message send successfully");
    }
 }
