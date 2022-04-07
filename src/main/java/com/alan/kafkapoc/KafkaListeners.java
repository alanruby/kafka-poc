package com.alan.kafkapoc;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(
            topics = "kafkatop",
            groupId = "groupId", // unique
            containerFactory = "messageFactory"
    )
    void listener(Message data) {
        System.out.println("## Listener received: "+ data);
    }
}
