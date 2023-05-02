package com.example.trial.Ccontroller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.trial.Cmodel.Logincheck;
import com.example.trial.Cservice.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	public LoginService ser;
	
	@PostMapping("/adddetails")
	public Logincheck add(@RequestBody Logincheck lo)
	{
		return ser.add(lo);
	}
	
	@PostMapping("/login")
	public String login(@RequestBody Map<String,String> loginDataMap)
	{
		String username = loginDataMap.get("username");
		String password = loginDataMap.get("password");
		String result = ser.loginCheckData(username, password);
		return result;
	}

}
