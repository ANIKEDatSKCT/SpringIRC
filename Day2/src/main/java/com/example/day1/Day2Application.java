package com.example.day1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Day2Application {

	public static void main(String[] args) {
		SpringApplication.run(Day2Application.class, args);
		
	}
	String name="Aniked";
	@Value("${valValue:Aniked.E.P}")
	String val;
	
	@GetMapping("/hello")
	public String welcome()
	{
		return "Hello world";
	}
	@GetMapping("/aniked")
	public String display()
	{
		return "Welcome "+name;
	}
	@GetMapping("/value")
	public String value()
	{
		return "welcome "+val;
	}

}
