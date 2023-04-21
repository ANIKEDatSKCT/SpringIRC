package com.example.trial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.trial.proj.Proj;
import com.example.trial.service.Projservice;
@RestController
public class Projcontroller {
	@Autowired
	public Projservice serve;
	
	@PostMapping("/project")
	public Proj addDetails(@RequestBody  Proj pro)
	{
		return serve.saveInfo(pro);
	}

}
