package com.example.trial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trial.model.LoanApplicationModel;
import com.example.trial.model.UserModel;
import com.example.trial.repository.AdminRepository;
import com.example.trial.repository.LoanApplicationRepository;
import com.example.trial.repository.LoginRepository;
import com.example.trial.repository.UserRepository;

@Service
public class ProjectService implements ProjectServiceInterface{
	@Autowired
	public AdminRepository arep;
	@Autowired
	public LoginRepository lrep;
	@Autowired
	public UserRepository urep;
	@Autowired
	public LoanApplicationRepository larep;
	@Override
	public List<UserModel> getuser() {
		// TODO Auto-generated method stub
		return urep.findAll();
	}
	@Override
	public UserModel postuser(UserModel um) {
		// TODO Auto-generated method stub
		return urep.save(um);
	}
	@Override
	public UserModel updateuser(UserModel um) {
		// TODO Auto-generated method stub
		return urep.saveAndFlush(um);
	}
	public void deletebyid(int id) {
		// TODO Auto-generated method stub
		urep.deleteById(id);
	}
	public List<LoanApplicationModel> getuserloan() {
		// TODO Auto-generated method stub
		return larep.findAll();
	}
	@Override
	public LoanApplicationModel postuserloan(LoanApplicationModel um) {
		// TODO Auto-generated method stub
		return larep.save(um);
	}
	@Override
	public LoanApplicationModel updateuserloan(LoanApplicationModel um) {
		// TODO Auto-generated method stub
		return larep.saveAndFlush(um);
	}
	public void deletebyidloan(int id) {
		// TODO Auto-generated method stub
		larep.deleteById(id);
	}
	
	
	
	
	
	

}
