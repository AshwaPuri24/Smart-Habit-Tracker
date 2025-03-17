package com.habittracker.backend.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.habittracker.backend.entity.enums.Category;
import com.habittracker.backend.entity.enums.Frequency;
import com.habittracker.backend.entity.enums.Priority;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Habit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String description; // For notes

    @Enumerated(EnumType.STRING)
    private Frequency frequency; // DAILY, WEEKLY, etc.

    @Enumerated(EnumType.STRING)
    private Priority priority; // HIGH, MEDIUM, LOW

    @Enumerated(EnumType.STRING)
    private Category category; // HEALTH, PRODUCTIVITY, etc.

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "habit", cascade = CascadeType.ALL)
    private List<Reminder> reminders = new ArrayList<>();

    @OneToMany(mappedBy = "habit", cascade = CascadeType.ALL)
    private List<HabitCompletion> completions = new ArrayList<>();

    private int streak;
    private LocalDate lastCompleted;
    private Integer targetDays;
}