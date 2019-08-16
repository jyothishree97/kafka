package com.stackroute.kafkaproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Service
@RestController
@RequestMapping("Kafka")
public class KafkaProducer {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
//
//    public void sendMessage(String msg) {
//        kafkaTemplate.send("test-kafka", msg);
//    }
//
//
    @GetMapping("/publish/{message}")
    public String post(@PathVariable ("message") final String message){

        return "published succefully";
    }

}
