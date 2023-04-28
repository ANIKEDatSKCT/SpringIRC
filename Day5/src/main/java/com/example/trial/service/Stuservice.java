package com.example.trial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.trial.model.Stumodel;
import com.example.trial.repository.Sturepo;

@Service
public class Stuservice {
	
	@Autowired
	public Sturepo repo;

	public Stumodel postdetails(Stumodel stu) {
		// TODO Auto-generated method stub
		return repo.save(stu);
	}

	public void deletedetails(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

	public List<Stumodel> sortdetails(String name) {
		// TODO Auto-generated method stub
		return repo.findAll(Sort.by(name).descending());
	}

	public List<Stumodel> pagination(int num, int size) {
		// TODO Auto-generated method stub
		Page<Stumodel> p=repo.findAll(PageRequest.of(num, size));
		return p.getContent();
	}

	public List<Stumodel> paginationsorting(int num, int size, String name) {
		// TODO Auto-generated method stub
		Page<Stumodel> p=repo.findAll(PageRequest.of(num, size, Sort.by(name).descending()));
		return p.getContent();
	}

	public List<Stumodel> getdet() {
		// TODO Auto-generated method stub
		return repo.getAllData();
	}

	public List<Stumodel> getdatabyid(int id) {
		// TODO Auto-generated method stub
		return repo.getByid(id);
	}

	public List<Stumodel> getdatabyname(String name) {
		// TODO Auto-generated method stub
		return repo.getByname(name);
	}

	public List<Stumodel> getbyrollno(String rn) {
		// TODO Auto-generated method stub
		return repo.getByrollno(rn);
	}

	public List<Stumodel> inbetween(int start, int end) {
		// TODO Auto-generated method stub
		return repo.between(start, end);
	}

	
	
	
	
	
	

}
