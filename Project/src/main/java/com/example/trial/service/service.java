package com.example.trial.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trial.domain.Anime;
import com.example.trial.repository.Repository;

@Service
public class service {
	
	
	@Autowired
	public Repository repo;

	public Anime savedetails(Anime an) {
		// TODO Auto-generated method stub
		return repo.save(an);
	}

	public void deletedetails(int byid) {
		// TODO Auto-generated method stub
		 repo.deleteById(byid);
	}

	public Optional<Anime> getdetail(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	

	public List<Anime> getalldetails() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public Anime updatedetails(int id, Anime an) {
		// TODO Auto-generated method stub
		Anime obj=repo.findById(id).get();
		if(Objects.nonNull(an.getName())&&!"".equalsIgnoreCase(an.getName()))
		{
			obj.setName(an.getName());
		}
		if(Objects.nonNull(an.getCreator())&&!"".equalsIgnoreCase(an.getCreator()))
		{
			obj.setCreator(an.getCreator());
		}
		if(Objects.nonNull(an.getRating())&&!"".equalsIgnoreCase(an.getRating()))
		{
			obj.setRating(an.getRating());
		}
		if(Objects.nonNull(an.getReleaseDate())&&!"".equalsIgnoreCase(an.getReleaseDate()))
		{
			obj.setReleaseDate(an.getReleaseDate());
		}
		if(Objects.nonNull(an.getType())&&!"".equalsIgnoreCase(an.getType()))
		{
			obj.setType(an.getType());
		}
		return repo.save(obj);
	}

	

	
	
	
	
	

}
