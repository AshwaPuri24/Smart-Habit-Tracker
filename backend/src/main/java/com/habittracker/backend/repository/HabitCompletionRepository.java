package com.habittracker.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.habittracker.backend.entity.HabitCompletion;

public interface HabitCompletionRepository extends JpaRepository<HabitCompletion, Long>{

}
