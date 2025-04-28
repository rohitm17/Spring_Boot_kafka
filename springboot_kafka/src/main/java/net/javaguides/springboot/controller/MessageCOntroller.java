package net.javaguides.springboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.kafka.KafkaProducer;



@RestController
@RequestMapping("/api/v1/kafka")
public class MessageCOntroller {

    private KafkaProducer kafkaProducer;

    public MessageCOntroller(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }


    
  
    //http://localhost:8080/api/v1/kafka/publish?message=hello
    @GetMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam("message") String message){
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent to the topic");
    }
}
