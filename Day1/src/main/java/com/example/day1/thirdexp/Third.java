package com.example.day1.thirdexp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class Third {
	
	@Value("${namevalue:Aniked}")
	public String name;
	
	
	@GetMapping("/third")
	@ResponseBody
	
	public String display()
	{
		return "welcome To restapi "+name;
	}

}
