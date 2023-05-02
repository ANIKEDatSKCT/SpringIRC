package com.example.trial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trial.model.Mapmodel1;
import com.example.trial.model.Mapmodel2;
import com.example.trial.repository.Map1Repo;
import com.example.trial.repository.Map2Repo;

@Service
public class Mapservices {
	
	@Autowired
	public Map1Repo repo1;
	
	@Autowired
	public Map2Repo repo2;

	public Mapmodel1 adddetails(Mapmodel1 m1) {
		// TODO Auto-generated method stub
		return repo1.save(m1);
	}

	public Mapmodel2 adddetails2(Mapmodel2 m2) {
		// TODO Auto-generated method stub
		return repo2.save(m2);
	}

	public List<Mapmodel1> getall() {
		// TODO Auto-generated method stub
		return repo1.findAll();
	}
	
	
	

}
