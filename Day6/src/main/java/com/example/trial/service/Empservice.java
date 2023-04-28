package com.example.trial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trial.model.Empmodel;
import com.example.trial.repository.Emprepository;

@Service
public class Empservice {
	
	
	@Autowired
	public Emprepository re;

	public Empmodel postdetails(Empmodel em) {
		
		return re.save(em);
	}

	public List<Empmodel> alldet() {
		// TODO Auto-generated method stub
		return re.getAlldetails();
	}

}
