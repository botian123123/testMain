package com.test.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.cicdtest.model.Model;
import com.example.sub2.Modle2;


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

		};
	}
}
