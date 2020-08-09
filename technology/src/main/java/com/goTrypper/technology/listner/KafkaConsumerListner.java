package com.goTrypper.technology.listner;

import com.goTrypper.technology.model.UserLocationObj;
import com.goTrypper.technology.repository.UserLocationRepositiory;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerListner {
    @Autowired
    UserLocationRepositiory userLocationReposity;

 /*   @KafkaListener(topics = "test", groupId = "userId")
    public void consume(String message) {
        System.out.println("Consumed Message:" + message);
    }*/

    @KafkaListener(topics = "test", groupId = "userId",containerFactory = "userKafkaListenerFactory" )
    public void consumeJson(UserLocationObj userLocationObj){
        System.out.println("Consumed Json Message:"+ userLocationObj);
        UserLocationObj respose =  userLocationReposity.save(userLocationObj);
    }
}
