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
import com.example.trial.repository.Sturepo;
import com.example.trial.service.Stuservice;

import jakarta.xml.soap.Name;

@RestController
public class Stucontroller {
	
	@Autowired
	public Stuservice serve;
	
	@Autowired
	public Sturepo re;
	
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
	
	@GetMapping("/gett")
	public List<Stumodel> getdet()
	{
		return serve.getdet();
	}
	
	@GetMapping("/gett/{id}")
	public List<Stumodel> getdatabyid(@PathVariable("id")int id)
	{
		return serve.getdatabyid(id);
	}
	
	@GetMapping("/gett/name/{name}")
	public List<Stumodel> getdatabyname(@PathVariable("name")String name)
	{
		return serve.getdatabyname(name);
	}
	
	@GetMapping("/gett/rollno/{rollno}")
	public List<Stumodel> getbyrollno(@PathVariable("rollno")String rn)
	{
		return serve.getbyrollno(rn);
	}
	
	@GetMapping("/getp/{start}/{end}")
	public List<Stumodel> inbetween(@PathVariable("start")int start,@PathVariable("end")int end)
	{
		return serve.inbetween(start,end);
	}
	
	@DeleteMapping("/del/{id}")
	public String delet(@PathVariable("id")int id)
	{
		re.dele(id);
		return "deleted using query";
	}

}
