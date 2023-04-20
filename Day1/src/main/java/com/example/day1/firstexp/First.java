package com.example.day1.firstexp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class First {
	@GetMapping("/hello")
	@ResponseBody
	
	public String welcome()
	{
		return "Welcome To RESTAPI";
	}

}
