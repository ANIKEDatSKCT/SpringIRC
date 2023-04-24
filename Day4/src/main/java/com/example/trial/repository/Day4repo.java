package com.example.trial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trial.model.Day4;

public interface Day4repo extends JpaRepository<Day4, Integer> {
	
	
	public List<Day4> findByplacename( String name);

}
