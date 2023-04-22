package com.example.trial.service;

import java.util.List;

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


	public List<Proj> fetchdetails() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}


	public Proj fetchbyId(int byid) {
		// TODO Auto-generated method stub
		return repo.findById(byid).get();
	}


	public void deletebyid(int byid) {
		
		
		 repo.deleteById(byid);
		
	}


	public Proj getbyname(String name) {
		// TODO Auto-generated method stub
		return repo.findByname(name);
	}


	

}
