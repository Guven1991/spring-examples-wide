package com.guven;


import com.guven.model.Notification;
import com.guven.producer.NotificationProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class RabbitApplication {
    public static void main(String[] args) {
        SpringApplication.run(RabbitApplication.class, args);
    }
}
