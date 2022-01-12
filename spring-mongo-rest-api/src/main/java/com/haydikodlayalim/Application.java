package com.haydikodlayalim;

import com.haydikodlayalim.repository.KullaniciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories  //bu projede kullanılan mongodb repository lerini anable eder devreye alır
public class Application {

    @Autowired
    private KullaniciRepository kullaniciRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
