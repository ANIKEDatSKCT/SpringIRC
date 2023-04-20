package com.example.day1.secondexp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Second {
	 public String name="Aniked";
	 @GetMapping("/second")
	 @ResponseBody
	
	public String display()
	{
		return "Welcome "+name;
	}

}
