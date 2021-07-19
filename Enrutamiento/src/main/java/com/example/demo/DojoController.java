package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {

	@RequestMapping(value = "/dojo/{dojo}", method = RequestMethod.GET)
	public String dojo(@PathVariable("dojo") String dojo) {
		return "¡El Dojo es increíble!";
	}

	@RequestMapping(value = "/burbank-dojo/{burbank-dojo}", method = RequestMethod.GET)
	public String burbank(@PathVariable("burbank-dojo") String burbankDojo) {
		return "El Dojo Burbank está localizado al sur de California";
	}

	@RequestMapping(value = "/san-jose/{san-jose}", method = RequestMethod.GET)
	public String sanJose(@PathVariable("san-jose") String sanJose) {
		return "El Dojo SJ es el cuartel general";
	}
}
