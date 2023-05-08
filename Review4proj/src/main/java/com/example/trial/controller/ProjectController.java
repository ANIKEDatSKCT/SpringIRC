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

import com.example.trial.model.LoanApplicationModel;
import com.example.trial.model.UserModel;
import com.example.trial.service.ProjectService;

@RestController
public class ProjectController {
	
	
	@Autowired
	public ProjectService serve;
	
	
	@GetMapping("/user/getall")
	public List<UserModel> getuser()
	{
		return serve.getuser();
	}
	
	@PostMapping("/user/post")
	public UserModel postuser(@RequestBody UserModel um)
	{
		return serve.postuser(um);
	}
	
	@PutMapping("/user/put")
	public UserModel updateuser(@RequestBody UserModel um)
	{
		return serve.updateuser(um);
	}
	@DeleteMapping("/user/delete/{id}")
	public String deletebyid(@PathVariable("id")int id)
	{
		serve.deletebyid(id);
		return"Deletion was successful";
	}
	

	@GetMapping("/loan/getall")
	public List<LoanApplicationModel> getuserloan()
	{
		return serve.getuserloan();
	}
	
	@PostMapping("/loan/post")
	public LoanApplicationModel postuserloan(@RequestBody LoanApplicationModel um)
	{
		return serve.postuserloan(um);
	}
	
	@PutMapping("/loan/put")
	public LoanApplicationModel updateuserloan(@RequestBody LoanApplicationModel um)
	{
		return serve.updateuserloan(um);
	}
	@DeleteMapping("/loan/delete/{id}")
	public String deletebyidloan(@PathVariable("id")int id)
	{
		serve.deletebyidloan(id);
		return"Deletion was successful";
	}

}
