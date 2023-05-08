package com.example.trial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trial.Model.Logincheck;

public interface Loginrepository extends JpaRepository<Logincheck, Integer> {
	
	Logincheck findByusername(String username);
	

}
