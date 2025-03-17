package com.habittracker.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.habittracker.backend.entity.Reminder;

public interface ReminderRepository extends JpaRepository<Reminder, Long>{

}
