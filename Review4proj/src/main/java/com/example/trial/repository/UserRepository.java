package com.example.trial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.trial.model.UserModel;
@Repository
public interface UserRepository extends JpaRepository<UserModel,Integer> {
	

}
