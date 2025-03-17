package com.habittracker.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.habittracker.backend.entity.Habit;

public interface HabitRepository extends JpaRepository<Habit, Long>{

}
