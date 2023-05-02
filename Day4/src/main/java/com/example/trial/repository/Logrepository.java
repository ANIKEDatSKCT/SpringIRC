package com.example.trial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trial.model.Log;

public interface Logrepository extends JpaRepository<Log, Integer> 
{
		Log findByusername(String username);
}
