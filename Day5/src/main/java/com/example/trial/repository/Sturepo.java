package com.example.trial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trial.model.Stumodel;

public interface Sturepo extends JpaRepository<Stumodel, Integer> {

}
