package com.example.trial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.trial.model.Stumodel;
import com.example.trial.service.Stuservice;

@RestController
public class Stucontroller {
	
	@Autowired
	public Stuservice serve;
	
	@PostMapping("/post")
	public Stumodel postdetails(@RequestBody Stumodel stu)
	{
		return serve.postdetails(stu);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String deletedetails(@PathVariable("id") int id)
	{
		serve.deletedetails(id);
		return "Deletion was Successful";
	}
	
	@GetMapping("/sort/{name}")
	public List<Stumodel> sortdetails(@PathVariable("name") String name)
	{
		return serve.sortdetails(name);
	}
	
	
	@GetMapping("/pagination/{pnu}/{psize}")
	public List<Stumodel> pagination(@PathVariable("pnu") int num,@PathVariable("psize") int size)
	{
		return serve.pagination(num,size);
	}
	
	@GetMapping("/paginationsort/{pnum}/{psize}/{name}")
	public List<Stumodel> paginationsorting(@PathVariable("pnum")int pnum,@PathVariable("psize")int psize,@PathVariable("name")String name)
	{
		return serve.paginationsorting(pnum,psize,name);
	}

}
