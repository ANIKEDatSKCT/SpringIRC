package com.example.trial.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.trial.model.Day4;
import com.example.trial.repository.Day4repo;

@Service
public class Day4Service {
	@Autowired
	public Day4repo repo;

	public Day4 saveinfo(Day4 da) {
		// TODO Auto-generated method stub
		return repo.save(da);
	}

	public List<Day4> getall() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public Optional<Day4> getbyid(int byid) {
		// TODO Auto-generated method stub
		return repo.findById(byid);
		
	}

	public void deletebyid(int byid) {
		// TODO Auto-generated method stub
		repo.deleteById(byid);
	}

	public Day4 updatedetails(Day4 da) {
		// TODO Auto-generated method stub
		return  repo.saveAndFlush(da);
	}


		
	
	
	
	
	

}
