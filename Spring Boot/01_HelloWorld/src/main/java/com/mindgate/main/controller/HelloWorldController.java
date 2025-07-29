package com.mindgate.main.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("myapi")
public class HelloWorldController {

	public HelloWorldController() {
		log.info("HelloWorldController object created");
	}

	// http://localhost:8181/myapi/dogreet
	@DeleteMapping("dogreet")
	public String greetDelete() {
		log.info("greetDelete() called");
		return "Hello World From Spring Boot - DeleteMappling";
	}

	// http://localhost:8181/myapi/dogreet
	@PutMapping("dogreet")
	public String greetPut() {
		log.info("greetPut() called");
		return "Hello World From Spring Boot - PutMapping";
	}

	// http://localhost:8181/myapi/dogreet
	@PostMapping("dogreet")
	public String greetPost() {
		log.info("greetPost() called");
		return "Hello World From Spring Boot - PostMapping";
	}

	// http://localhost:8181/myapi/dogreet
	@GetMapping("dogreet")
	public String greetGet() {
		log.info("greetGet() called");
		return "Hello World From Spring Boot - GetMapping";
	}
}
