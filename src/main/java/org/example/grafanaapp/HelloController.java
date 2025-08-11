package org.example.grafanaapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        log.info("INFO LOG");
        log.error("ERROR LOG");
        log.warn("WARN LOG");
        return "Hello from Spring Boot!";
    }
}