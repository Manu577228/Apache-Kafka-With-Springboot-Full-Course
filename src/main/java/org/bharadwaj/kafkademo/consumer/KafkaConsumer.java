package org.bharadwaj.kafkademo.consumer;

import lombok.extern.slf4j.Slf4j;
import org.bharadwaj.kafkademo.payload.Student;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@Slf4j
public class KafkaConsumer {

//    @KafkaListener(topics = "bharadwaj", groupId = "myGroup")
    public void consumeMsg(String msg) {
        log.info(format("Consuming the message from bharadwaj Topic:: %s", msg));
    }

    @KafkaListener(topics = "bharadwaj", groupId = "myGroup")
    public void consumeJsonMsg(Student student) {
        log.info(format("Consuming the message from bharadwaj Topic:: %s", student.toString()));
    }
}