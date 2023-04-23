package com.example.trial.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trial.domain.Anime;

public interface Repository extends JpaRepository<Anime, Integer> {


}
