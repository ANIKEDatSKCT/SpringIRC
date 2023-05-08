package com.example.trial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.trial.model.AdminModel;
@Repository
public interface AdminRepository extends JpaRepository<AdminModel, Integer> {

}
