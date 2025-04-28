package net.javaguides.springboot.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.payload.User;

@Service
public class JsonKafkaCOnsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaCOnsumer.class);


    @KafkaListener(topics= "javaguides_json" , groupId="myGroup")
    public void consume(User user){
        LOGGER.info(String.format("Json Message received -> %s", user.toString()));
    }
}
