package com.example.trial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trial.proj.Proj;

public interface Projrepo extends JpaRepository<Proj, Integer> {
	
	public List<Proj> findAllByname(String name);

}
