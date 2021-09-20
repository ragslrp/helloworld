package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping(value={"/"})
public class HelloWorldController {
	
	@GetMapping(value = "/getMessage", produces = MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "getMessage", 
	description = "The API is getMessage",
	tags = { "helloworld" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Json Response String will contain the details"),
			@ApiResponse(responseCode = "404", description = "") })
	public ResponseEntity<String> getRiskProfile() {
		return new ResponseEntity<String>("Hello World",HttpStatus.OK);
	}
}
