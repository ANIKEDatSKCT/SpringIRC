package com.example.trial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trial.Model.ProductContents;

public interface ProductcontentRepository extends JpaRepository<ProductContents, Integer> {
	
	

}
