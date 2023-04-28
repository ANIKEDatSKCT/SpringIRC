package com.example.trial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.trial.model.Stumodel;

import jakarta.transaction.Transactional;

public interface Sturepo extends JpaRepository<Stumodel, Integer> {
	
	
	@Query(value="select * from studentinfo",nativeQuery = true)
	public List<Stumodel> getAllData();
	
	
	@Query(value="select * from studentinfo where id=:id",nativeQuery = true)
	public List<Stumodel> getByid(int id);
	
	@Query(value="select * from studentinfo where name=:name",nativeQuery = true)
	public List<Stumodel> getByname(String name);
	
	@Query(value="select * from studentinfo where rollno=:rollno",nativeQuery = true)
	public List<Stumodel> getByrollno(String rollno);
	
	@Query(value="select * from studentinfo where id between ?1 and ?2",nativeQuery = true)
	public List<Stumodel> between(@Param("start")int start,@Param("end")int end);
	
	
	@Modifying
	@Transactional
	@Query(value="delete from studentinfo where id=?1",nativeQuery = true)
	Integer dele(@Param("id")int id);
	

}
