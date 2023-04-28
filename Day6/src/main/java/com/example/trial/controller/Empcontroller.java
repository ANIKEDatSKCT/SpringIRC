package com.example.trial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.trial.model.Empmodel;
import com.example.trial.repository.Emprepository;
import com.example.trial.service.Empservice;

@RestController
public class Empcontroller {
	
	@Autowired
	public Empservice se;
	
	@Autowired
	public Emprepository rep;
	
	@PostMapping("/postin")
	public Empmodel postdetails(@RequestBody Empmodel em)
	{
		return se.postdetails(em);
	}
	
	@GetMapping("/getall")
	public List<Empmodel> alldet()
	{
		return se.alldet();
	}
	
	@DeleteMapping("/delbyid/{age}")
	public String delete(@PathVariable("age") String age )
	{
		rep.deletebyage(age);
		return "deletion was successful";
	}
	
	@PutMapping("/put/{name}/{name2}")
	public String update(@PathVariable("name")String name,@PathVariable("name2")String name2)
	{
		rep.updateit(name, name2);
		return "The Deletion was successful";
	}

}
