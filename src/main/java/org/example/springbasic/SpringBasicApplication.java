package org.example.springbasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringBasicApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBasicApplication.class, args);
    }

}
