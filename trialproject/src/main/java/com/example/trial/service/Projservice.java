package com.example.trial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trial.proj.Proj;
import com.example.trial.repository.Projrepo;
@Service
public class Projservice {
	@Autowired
	public Projrepo repo;
	
	
	public Proj saveInfo(Proj pr)
	{
		return repo.save(pr);
	}

}
