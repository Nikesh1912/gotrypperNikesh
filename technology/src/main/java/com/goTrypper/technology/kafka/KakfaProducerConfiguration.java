package com.goTrypper.technology.kafka;

import com.goTrypper.technology.model.UserLocationObj;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KakfaProducerConfiguration {

    @Autowired
    KafkaConfig kafkaConfig;

    @Bean
    public ProducerFactory<String, UserLocationObj> producerFactory() {
        Map<String, Object> config = new HashMap<>();

        System.out.println("Kafka Server" + kafkaConfig.getKafkaBootStrapServer());

        config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaConfig.getKafkaBootStrapServer());
        config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);


        return new DefaultKafkaProducerFactory<>(config);
    }

    @Bean
    public KafkaTemplate<String, UserLocationObj> kafkaTemplate() {
        return new KafkaTemplate<>(producerFactory());
    }
}
