package com.example.trial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.trial.Model.Querytesting;

import jakarta.transaction.Transactional;

public interface QuerytestingRepositoryt extends JpaRepository<Querytesting, Integer> {
	
	
	//Native Query
	@Query(value="select * from query_testing",nativeQuery = true)
	public List<Querytesting> getallquery();
	
	
	@Modifying
	@Transactional
	@Query(value="delete from query_testing where tid=:age",nativeQuery = true)
	public void querydelete(@Param("age")int age);
	
	
	@Modifying
	@Transactional
	@Query(value="update query_testing set tage=?1 where tname=?2",nativeQuery = true)
	public void queryupdate(int age,String name);
	
	
	//Jpql Query
	@Query("select s from Querytesting s where s.tid=?1")
	public Querytesting querybyid(int id);
	
	@Modifying
	@Transactional
	@Query(value = "update Querytesting s set s.tname=?1 where s.tage=?2 ")
	public void jpqlupdate(String name,int age);
	
	@Modifying
	@Transactional
	@Query(value="delete from Querytesting s where s.tname=?1")
	public void jpqldelete(String name);
	
	 
	@Query(value="select s from Querytesting s where s.tage between ?1 and ?2 ")
	public List<Querytesting>between(int one,int two);
	
	@Query(value="select s from Querytesting s where tname like 'A%'")
	public List<Querytesting> like();
	
	

}
