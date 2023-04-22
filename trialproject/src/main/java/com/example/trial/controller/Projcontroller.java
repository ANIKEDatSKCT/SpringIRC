package com.example.trial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	
	@GetMapping("/project")
	public <list>List<Proj> fetchdetails()
	{
		return serve.fetchdetails();
		
	}
	
	
	@GetMapping("/project/{id}")
	public Proj fetchbyId(@PathVariable("id") int byid)
	{
		return serve.fetchbyId(byid);
	}
	
	@DeleteMapping("/project/{id}")
	public String deletebyid(@PathVariable("id") int byid)
	{
		serve.deletebyid(byid);
		return "Deletion was Successful";
	}

}
