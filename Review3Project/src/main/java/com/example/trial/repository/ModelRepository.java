package com.example.trial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.trial.Model.Logincheck;
import com.example.trial.Model.Model1;

import jakarta.transaction.Transactional;

public interface ModelRepository extends JpaRepository<Model1, Integer> {
	
	
	
	@Query(value="select * from product",nativeQuery = true)
	public List<Model1> GetDetails();

	
	
	
	
	
	
	

}
