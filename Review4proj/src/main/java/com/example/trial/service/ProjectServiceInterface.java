package com.example.trial.service;

import java.util.List;

import com.example.trial.model.LoanApplicationModel;
import com.example.trial.model.UserModel;

public interface ProjectServiceInterface {
	
	
	public List<UserModel> getuser();
	public UserModel postuser(UserModel um);
	public UserModel updateuser(UserModel um);
	LoanApplicationModel postuserloan(LoanApplicationModel um);
	LoanApplicationModel updateuserloan(LoanApplicationModel um);
	
}
