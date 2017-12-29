package com.jm.jmtravelApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class JmTravelAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmTravelAppApplication.class, args);
	}
}
