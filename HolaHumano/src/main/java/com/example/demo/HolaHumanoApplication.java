package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HolaHumanoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolaHumanoApplication.class, args);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String helloHuman(@RequestParam(value = "firstName", required = false) String firstName) {
		String title = firstName != null ? "<h1>Hola " + firstName + "</h1>"
				: "<h1>Hola humano</h1>";
		String paragraph = "<p>Bienvenido a SpringBoot</p>";
		return "<div>" + title + paragraph + "</div>";
	}
}
