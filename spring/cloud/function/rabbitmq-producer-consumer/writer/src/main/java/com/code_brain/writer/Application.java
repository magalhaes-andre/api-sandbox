package com.code_brain.writer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.function.Supplier;

@SpringBootApplication(scanBasePackages = "com.code_brain.writer")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public Supplier<String> messageSupplier() {
        return () -> defaultMessage();
    }

    private String defaultMessage() {
        return "Default checking message, time is: ".concat(new Date().toString());
    }
}
