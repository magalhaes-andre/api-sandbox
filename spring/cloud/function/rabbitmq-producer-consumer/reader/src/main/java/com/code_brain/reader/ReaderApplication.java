package com.code_brain.reader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
public class ReaderApplication {
	private Logger logger = Logger.getGlobal();

	public static void main(String[] args) {
		SpringApplication.run(ReaderApplication.class, args);
	}

	@Bean
	public Consumer<String> message(){
		return val -> logger.log(Level.INFO, val);
	}
}
