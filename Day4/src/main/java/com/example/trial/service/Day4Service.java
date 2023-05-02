package com.example.trial.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.example.trial.model.Day4;
import com.example.trial.repository.Day4repo;
import com.example.trial.repository.Logrepository;

@Service
public class Day4Service {
	@Autowired
	public Day4repo repo;
	
	@Autowired
	public Logrepository rep;

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

	public List<Day4> getbyname(String name) {
		// TODO Auto-generated method stub
		return repo.findByplacename(name);
	}

	public List<Day4> sorting(String name) {
		// TODO Auto-generated method stub
		return repo.findAll(Sort.by(name).descending());
	}

	public List<Day4> pagination(int num, int size) {
		// TODO Auto-generated method stub
		Page<Day4> p=repo.findAll(PageRequest.of(num, size));

		return p.getContent()
;
	}

	public List<Day4> pagesorting(int num, int size, String name) {
		// TODO Auto-generated method stub
		Page<Day4> p=repo.findAll(PageRequest.of(num, size, Sort.by(name).descending()));
		return p.getContent();
	}	

}
