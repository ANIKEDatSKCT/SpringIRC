package com.example.trial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trial.proj.Proj;

public interface Projrepo extends JpaRepository<Proj, Integer> {

}
