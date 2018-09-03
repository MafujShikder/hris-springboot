package com.hisptz.hris;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class HrisApplication{


    public static void main(String[] args) {
        SpringApplication.run(HrisApplication.class, args);
    }


}
