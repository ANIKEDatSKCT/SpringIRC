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

import com.example.trial.Model.Model1;
import com.example.trial.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	public ProductService ser;
	
	
	
	@GetMapping("/getall")
	public List<Model1> getdet(Model1 me)
	{
		return ser.getdet(me);
	}
	
	
	@PostMapping("/post")
	public Model1 savedat(@RequestBody Model1 mod)
	{
		return ser.savedat(mod);
	}
	
	
	
	@DeleteMapping("/deletebyid/{id}")
	public String delet(@PathVariable("id") int id)
	{
		ser.delet(id);
		return "Deletion by Method Was Successful";
	}
	
	@PutMapping("/update/{id}")
	public Model1 update(@RequestBody Model1 mod,@PathVariable("id")int id)
	{
		return ser.update(mod,id);
	}
	
	@GetMapping("/getbyid/{id}")
	public Model1 getbyid(@PathVariable("id")int id)
	{
		return ser.getbyid(id);
	}

}
