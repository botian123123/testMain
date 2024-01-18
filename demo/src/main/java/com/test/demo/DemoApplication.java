package com.test.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.cicdtest.model.Model;

import lombok.extern.slf4j.Slf4j;
import main.java.com.example.sub2.Modle2;

@Slf4j
@SpringBootApplication
public class DemoApplication {

	@Autowired
	Model person;
	@Autowired
	Modle2 car;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner test() {
		return args -> {
			person.speak();
			System.out.println(" driving " + car.getName() + " " + car.getType());
			log.info("this is log!!!");
		};
	}
}
