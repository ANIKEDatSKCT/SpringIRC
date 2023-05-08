package com.example.trial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.trial.Model.Logincheck;
import com.example.trial.Model.Model1;
import com.example.trial.Model.Querytesting;
import com.example.trial.repository.Loginrepository;
import com.example.trial.repository.ModelRepository;
import com.example.trial.repository.QuerytestingRepositoryt;

@Service
public class ProductService {
	
	@Autowired
	public ModelRepository repo;
	
	@Autowired
	public QuerytestingRepositoryt queryrep;
	
	@Autowired
	public Loginrepository lrepo;

	public List<Model1> getdet() {
		// TODO Auto-generated method stub
		return repo.GetDetails();
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
		return repo.saveAndFlush(mod);
	}

	public Model1 getbyid(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	public Querytesting postly(Querytesting q) {
		// TODO Auto-generated method stub
		return queryrep.save(q);
	}

	public List<Querytesting> getquery() {
		// TODO Auto-generated method stub
		return queryrep.getallquery();
	}

	public void delquery(int age) {
		// TODO Auto-generated method stub
		queryrep.querydelete(age);
		
	}

	public void upquery(int age, String name) {
		// TODO Auto-generated method stub
		 queryrep.queryupdate(age, name);
	}

	public Querytesting getbyidquery(int id) {
		// TODO Auto-generated method stub
		return queryrep.querybyid(id);
	}

	public void upjpql(String name, int age) {
		// TODO Auto-generated method stub
		queryrep.jpqlupdate(name, age);
	}

	public void deljpql(String name) {
		// TODO Auto-generated method stub
		queryrep.jpqldelete(name);
		
	}

	public List<Querytesting> betveen(int one, int two) {
		// TODO Auto-generated method stub
		return queryrep.between(one, two);
	}

	public List<Querytesting> likee() {
		// TODO Auto-generated method stub
		return queryrep.like();
	}
	
	
	public Logincheck add(Logincheck lo) {
		// TODO Auto-generated method stub
		return lrepo.save(lo);
	}
	
	public String loginCheckData(String username,String password)
	{
		Logincheck user = lrepo.findByusername(username);
		if(user == null)
		{
			return "No User Found/nPlease Try Again!!!!";
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

	public List<Logincheck> alllog() {
		// TODO Auto-generated method stub
		return lrepo.findAll();
	}

	public List<Querytesting> sorting(String name) {
		// TODO Auto-generated method stub
		return queryrep.findAll(Sort.by(name).descending());
	}

	public List<Querytesting> pagination(int num, int size) {
		// TODO Auto-generated method stub
		Page<Querytesting> qt=queryrep.findAll(PageRequest.of(num, size));
		return qt.getContent();
	}

}
