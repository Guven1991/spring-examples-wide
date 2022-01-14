package com.guven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class DataJpaAplication {
    public static void main(String[] args) {
        SpringApplication.run(DataJpaAplication.class, args);
    }
}
