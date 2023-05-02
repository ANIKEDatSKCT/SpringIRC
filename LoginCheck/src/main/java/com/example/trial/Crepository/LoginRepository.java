package com.example.trial.Crepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trial.Cmodel.Logincheck;

public interface LoginRepository extends JpaRepository<Logincheck, Integer> {

	Logincheck findByusername(String username);

}
