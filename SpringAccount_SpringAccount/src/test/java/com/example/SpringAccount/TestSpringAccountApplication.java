package com.example.SpringAccount;

import org.springframework.boot.SpringApplication;

public class TestSpringAccountApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringAccountApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
