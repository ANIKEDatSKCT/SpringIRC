package com.example.trial.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.trial.domain.Anime;
import com.example.trial.service.service;


@RestController
public class Acontroller {
	@Autowired
	public service serve;
	
	@PostMapping("/animeone")
	public Anime savedetails(@RequestBody Anime an)
	{
		return serve.savedetails(an);
	}
	
	
	@DeleteMapping("/animeone/{id}")
	public String deletedetails(@PathVariable("id") int byid)
	{
		serve.deletedetails(byid);
		return "Deletion was successful";
	}
	
	@GetMapping("/anime/{id}")
	public Optional<Anime> getdetail(@PathVariable("id") int id)
	{
		return serve.getdetail(id);
	}
	
	@GetMapping("/anime")
	public List<Anime> getalldetails()
	{
		return serve.getalldetails();
	}
	
	

}
