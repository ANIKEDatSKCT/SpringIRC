package com.example.trial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trial.Model.Model1;
import com.example.trial.repository.ModelRepository;

@Service
public class ProductService {
	
	@Autowired
	public ModelRepository repo;

	public List<Model1> getdet(Model1 me) {
		// TODO Auto-generated method stub
		return repo.GetDetails(me);
	}

	public Model1 savedat(Model1 mod) {
		// TODO Auto-generated method stub
		return repo.save(mod);
	}

	
	public void delet(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

	public Model1 update(Model1 mod, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Model1 getbyid(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	
	
	

}
