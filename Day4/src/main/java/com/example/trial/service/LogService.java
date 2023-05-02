package com.example.trial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trial.repository.Logrepository;
import com.example.trial.model.Log;
@Service
public class LogService 
{
	@Autowired
	private Logrepository repo;
	public String checkLogin(String username, String password)
	{
		// TODO Auto-generated method stub
		Log user=repo.findByusername(username);
		if(user == null) 
		{
			return "no user found";
		}
		else
		{
			if(user.getPassword().equals(password))
			{
				return "Login Successful";
			}
			else
			{
				return "Login Failed";
			}
		}
	}
	public Log addUser(Log l)
	{
		return repo.save(l);
	}
	public List<Log> getall()
	{
		return repo.findAll();
	}
}
