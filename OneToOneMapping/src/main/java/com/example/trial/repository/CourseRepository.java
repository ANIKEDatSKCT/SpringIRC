package com.example.trial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trial.Model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
