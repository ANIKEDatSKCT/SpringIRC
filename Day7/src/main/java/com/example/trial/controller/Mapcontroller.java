package com.example.trial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.trial.model.Mapmodel1;
import com.example.trial.model.Mapmodel2;
import com.example.trial.service.Mapservices;

@RestController
public class Mapcontroller {
	
	@Autowired
	public Mapservices serve;
	
	@PostMapping("/postin1")
	public Mapmodel1 adddetails(@RequestBody Mapmodel1 m1)
	{
		return serve.adddetails(m1);
	}
	
	@GetMapping("/getall")
	public List<Mapmodel1> getall()
	{
		return serve.getall();
	}
	
	
	
	

}
