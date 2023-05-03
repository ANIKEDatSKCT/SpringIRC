package com.example.trial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
info =@Info(
		title = "Product Details",
		version = "1.1.2",
		description = "",
		contact = @Contact(
				name = "Aniked",
				email = "Aniked@io"
				)
		)
)
public class Review3ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(Review3ProjectApplication.class, args);
	}

}
