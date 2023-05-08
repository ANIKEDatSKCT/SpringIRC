package com.example.trial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.trial.model.LoanApplicationModel;
@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplicationModel, Integer> {
	
	

}
