package com.habittracker.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.habittracker.backend.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
