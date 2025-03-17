package com.habittracker.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.habittracker.backend.entity.AISuggestion;

public interface AISuggestionRepository extends JpaRepository<AISuggestion, Long>{

}
