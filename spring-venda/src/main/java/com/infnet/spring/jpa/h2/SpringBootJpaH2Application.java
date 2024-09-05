package com.infnet.spring.jpa.h2;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class SpringBootJpaH2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaH2Application.class, args);
	}

}
