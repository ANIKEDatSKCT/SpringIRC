package com.example.trial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.trial.model.Empmodel;

import jakarta.transaction.Transactional;

public interface Emprepository extends JpaRepository<Empmodel, Integer> {
	
	@Query(value="select * from day6",nativeQuery = true)
	public List<Empmodel> getAlldetails();
	
	
	@Modifying
	@Transactional
	@Query(value="delete from day6 where age=:age",nativeQuery = true)
	public void deletebyage(@Param("age") String age);
	
	
	@Modifying
	@Transactional
	@Query(value="update day6 set name=?1 where name=?2",nativeQuery = true)
	public void updateit(@Param("name")String name,@Param("name1")String name2);
	

}
