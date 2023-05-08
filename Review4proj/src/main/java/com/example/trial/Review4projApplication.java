package com.example.trial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
info =@Info(
		title = "Loan Application",
		version = "1.1.2",
		description = "Details On LoanApplication",
		contact = @Contact(
				name = "Aniked",
				email = "Aniked@io"
				)
		)
)
public class Review4projApplication {

	public static void main(String[] args) {
		SpringApplication.run(Review4projApplication.class, args);
	}

}
