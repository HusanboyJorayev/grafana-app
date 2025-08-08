package org.example.grafanaapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@SpringBootApplication
public class GrafanaAppApplication {

    public static void main(String[] args) {
        log.info("🚀 Spring Boot application starting...");
        SpringApplication.run(GrafanaAppApplication.class, args);
    }
}
