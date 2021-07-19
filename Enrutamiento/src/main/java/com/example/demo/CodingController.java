package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/coding")
@RestController
public class CodingController {

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String hello() {
		return "¡Hola Coding Dojo!";
	}

	@RequestMapping(value = "/python", method = RequestMethod.GET)
	public String python() {
		return "¡Python/Django fue increíble!";
	}

	@RequestMapping(value = "/java", method = RequestMethod.GET)
	public String spring() {
		return "¡Java/Spring es mejor!";
	}
}
