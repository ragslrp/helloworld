package com.example.demo;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
 
@Configuration
public class OpenApiConfig {
 
	 @Bean
	     public OpenAPI customOpenAPI() {
		 Contact contact = new Contact();
	     contact.setEmail("");
		 return new OpenAPI()
	           .info(new Info()
	           .title("Hello world API")
//	           .version(appVersion)
//	           .description(appDesciption)
	           .contact(contact)
	           .license(new License().name("Rags").url("https://www.rags.com/")));
	     }
}