package com.habittracker.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.habittracker.backend.entity.Reward;

public interface RewardRepository extends JpaRepository<Reward, Long>{

}
