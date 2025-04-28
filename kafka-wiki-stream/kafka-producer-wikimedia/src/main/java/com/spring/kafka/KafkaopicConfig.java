package com.spring.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaopicConfig {
    
    @Bean
    public NewTopic topic(){
        return TopicBuilder.name("wikimedia_recentchange").build();
    }
}


//https://github.com/hovhannes84/springboot-kafka-real-world-project