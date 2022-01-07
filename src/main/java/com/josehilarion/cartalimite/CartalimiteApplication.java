package com.josehilarion.cartalimite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class CartalimiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartalimiteApplication.class, args);
	}

	//esto es temporal para probar q la app funcione ok
	@GetMapping
	public List<String> hello() {
		return List.of("Hello", "World");
	}

}
