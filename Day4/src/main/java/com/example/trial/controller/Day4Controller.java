package com.example.trial.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.trial.model.Day4;

import com.example.trial.service.Day4Service;

@RestController
public class Day4Controller {
	@Autowired
	public Day4Service serve;
	
	@PostMapping("/bus")
	public Day4 saveinfo(@RequestBody Day4 da)
	{
		return serve.saveinfo(da);
	}
	
	@GetMapping("/bus")
	public List<Day4> getall()
	{
		return serve.getall();
	}
	
	@GetMapping("/bus/{id}")
	public Optional<Day4> getbyid(@PathVariable("id")int byid)
	{
		return serve.getbyid(byid);
	}
	
	@DeleteMapping("/bus/{id}")
	public String deletebyid(@PathVariable("id")int byid)
	{
		serve.deletebyid(byid);
		return "the Deletion was successful";
	}
	
	
	@PutMapping("/bus")
	public Day4 updatedetails(@RequestBody Day4 da)
	{
		return serve.updatedetails(da);
	}
	
	@DeleteMapping("/busbyreqparam")
	public String deletebyidusingreqparam(@RequestParam("id")int byid)
	{
		serve.deletebyid(byid);
		return "the Deletion was successful";
	}
	
	@GetMapping("/byname/name/{name}")
	public List<Day4> getbyname(@PathVariable("name") String name )
	{
		return serve.getbyname(name);
	}
	
	
	@GetMapping("/sorting/{name}")
	public List<Day4> sorting(@PathVariable("name") String name)
	{
		return serve.sorting(name);
	}
	
	
	@GetMapping("/pagination/{pnum}/{psize}")
	public List<Day4> pagination(@PathVariable("pnum")int num,@PathVariable("psize")int size)
	{
		return serve.pagination(num,size);
	}
	
	@GetMapping("/paginationsorting/{pnum}/{psize}/{name}")
	public List<Day4> pagesorting(@PathVariable("pnum")int num,@PathVariable("psize")int size,@PathVariable("name")String name)
	{
		return serve.pagesorting(num,size,name);
	}
	
	
	

}
