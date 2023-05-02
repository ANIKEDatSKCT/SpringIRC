package com.example.trial.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.trial.model.Log;
import com.example.trial.service.LogService;
@RestController
public class Log_Controller 
{
	@Autowired
	private LogService lse; 
	@PostMapping("/login")
	public String login(@RequestBody Map<String,String> logicData)
	{
		String username=logicData.get("username");
		String password=logicData.get("password");
		String result=lse.checkLogin(username,password);
		return result;
	}
	@PostMapping("/adduser")
	public Log saveDetails(@RequestBody Log l)
	{
		return lse.addUser(l);
	}
	@GetMapping("/getdata")
	public List<Log> getDetails()
	{
		return lse.getall();
	}
}
