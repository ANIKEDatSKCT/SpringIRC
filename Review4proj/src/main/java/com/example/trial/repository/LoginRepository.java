package com.example.trial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.trial.model.LoginModel;
@Repository
public interface LoginRepository extends JpaRepository<LoginModel, Integer> {

}
